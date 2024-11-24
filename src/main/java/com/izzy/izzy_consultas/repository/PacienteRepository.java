package com.izzy.izzy_consultas.repository;

import com.izzy.izzy_consultas.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

    Optional<Paciente> findByNomeDePaciente(String nomeDePaciente);
    Optional<Paciente> findByEmail(String email);

}
