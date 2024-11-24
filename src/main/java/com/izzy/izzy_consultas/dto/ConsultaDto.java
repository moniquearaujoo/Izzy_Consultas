package com.izzy.izzy_consultas.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsultaDto {
    private Long id;
    private Date createdDate;
    private String nomeDePaciente;
    private Long paciente_Id;
    private String nomeDoProfissional;
    private Long profissional_Id;
    private String especialidade;
}
