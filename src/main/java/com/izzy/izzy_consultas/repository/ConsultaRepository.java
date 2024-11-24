package com.izzy.izzy_consultas.repository;

import com.izzy.izzy_consultas.model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

}
