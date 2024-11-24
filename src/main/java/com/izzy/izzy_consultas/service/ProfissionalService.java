package com.izzy.izzy_consultas.service;

import com.izzy.izzy_consultas.model.Profissional;
import com.izzy.izzy_consultas.repository.ProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfissionalService {
    @Autowired
    private ProfissionalRepository profissionalRepository;

    public Profissional salvarProfissional(Profissional profissional) {
        return profissionalRepository.save(profissional);
    }

    public List<Profissional> listarProfissionais() {
        return profissionalRepository.findAll();
    }
}
