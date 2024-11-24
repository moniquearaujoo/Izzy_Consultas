package com.izzy.izzy_consultas.validation;


import com.izzy.izzy_consultas.validation.impl.ProfissionalValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = ProfissionalValidator.class)
@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidProfissional {
    String message() default "O nome do diretor informado não é válido.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
