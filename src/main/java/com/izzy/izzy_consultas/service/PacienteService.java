package com.izzy.izzy_consultas.service;

import com.izzy.izzy_consultas.model.Paciente;
import com.izzy.izzy_consultas.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;

    public Paciente salvarPaciente(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    public List<Paciente> listarPacientes() {
        return pacienteRepository.findAll();
    }
}
