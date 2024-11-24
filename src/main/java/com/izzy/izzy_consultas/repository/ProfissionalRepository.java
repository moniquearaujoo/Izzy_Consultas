package com.izzy.izzy_consultas.repository;

import com.izzy.izzy_consultas.model.Paciente;
import com.izzy.izzy_consultas.model.Profissional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfissionalRepository extends JpaRepository<Profissional, Long> {
    Optional<Profissional> findByNomeDoProfissional(String nomeDoProfissional);
    Optional<Profissional> findByEmail(String email);
    Optional<Profissional> findByEspecialidade(String especialidade);

}
