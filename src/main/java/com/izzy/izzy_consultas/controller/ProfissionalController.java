package com.izzy.izzy_consultas.controller;

import com.izzy.izzy_consultas.model.Profissional;
import com.izzy.izzy_consultas.service.ProfissionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profissionais")
public class ProfissionalController {
    @Autowired
    private ProfissionalService profissionalService;

    @PostMapping
    public ResponseEntity<Profissional> cadastrarProfissional(@RequestBody Profissional profissional) {
        Profissional novoProfissional = profissionalService.salvarProfissional(profissional);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoProfissional);
    }

    @GetMapping
    public ResponseEntity<List<Profissional>> listarProfissionais() {
        return ResponseEntity.ok(profissionalService.listarProfissionais());
    }
}
