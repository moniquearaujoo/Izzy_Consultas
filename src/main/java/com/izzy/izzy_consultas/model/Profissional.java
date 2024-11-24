package com.izzy.izzy_consultas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "profissionais")
@Entity(name = "profissional")
@NoArgsConstructor
@Data
public class Profissional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long profissionalId;
    @Column(nullable = false, unique = true)
    @NotNull
    @Size(min = 3, max = 30)
    private String nomeDoProfissional;
    @Column(nullable = false, unique = true)
    @NotNull
    @Email
    private String email;
    @Column(nullable = false)
    @NotNull
    @Size(min = 6)
    private String senha;
    @Column(nullable = false)
    @NotNull
    @Size(max = 30)
    private String especialidade;
}
