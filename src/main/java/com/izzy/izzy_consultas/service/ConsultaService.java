package com.izzy.izzy_consultas.service;

import com.izzy.izzy_consultas.model.Consulta;
import com.izzy.izzy_consultas.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ConsultaService {
    @Autowired
    private ConsultaRepository consultaRepository;

    public Consulta marcarConsulta(Consulta consulta) {
        consulta.setCreatedDate(new Date()); // Define a data atual
        return consultaRepository.save(consulta);
    }

    public List<Consulta> listarConsultas() {
        return consultaRepository.findAll();
    }
}
