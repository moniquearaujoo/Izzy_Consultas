package com.izzy.izzy_consultas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "pacientes")
@Entity(name = "paciente")
@NoArgsConstructor
@Data
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pacienteId;
    @Column(nullable = false, unique = true)
    @NotNull
    @Size(min = 3, max = 30)
    private String nomeDePaciente;
    @Column(nullable = false, unique = true)
    @NotNull
    @Email
    private String email;

    @Column(nullable = false)
    @NotNull
    @Size(min = 6)
    private String senha;
}
