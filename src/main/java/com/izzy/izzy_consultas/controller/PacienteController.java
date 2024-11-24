package com.izzy.izzy_consultas.controller;

import com.izzy.izzy_consultas.model.Paciente;
import com.izzy.izzy_consultas.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    private PacienteService pacienteService;

    @PostMapping
    public ResponseEntity<Paciente> cadastrarPaciente(@RequestBody Paciente paciente) {
        Paciente novoPaciente = pacienteService.salvarPaciente(paciente);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoPaciente);
    }

    @GetMapping
    public ResponseEntity<List<Paciente>> listarPacientes() {
        return ResponseEntity.ok(pacienteService.listarPacientes());
    }
}
