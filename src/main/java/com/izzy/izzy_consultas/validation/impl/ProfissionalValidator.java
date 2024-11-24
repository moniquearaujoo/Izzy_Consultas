package com.izzy.izzy_consultas.validation.impl;

import com.izzy.izzy_consultas.validation.ProfissionalBase;
import com.izzy.izzy_consultas.validation.ValidProfissional;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ProfissionalValidator implements ConstraintValidator<ValidProfissional, String> {

    @Override
    public boolean isValid(String nomeProfissional, ConstraintValidatorContext context) {
        if (nomeProfissional == null || nomeProfissional.isEmpty()) {
            return true;
        }
        boolean isValid = ProfissionalBase.ProfissionalValido(nomeProfissional);
        if (!isValid) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(
                    String.format("O nome do Profissional  '%s' informado não é válido.", nomeProfissional)
            ).addConstraintViolation();
        }
        return isValid;
    }
}

