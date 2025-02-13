package com.enriqueforte.emisiones_co2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enriqueforte.emisiones_co2.model.Emission;
import com.enriqueforte.emisiones_co2.repository.EmissionRepository;

@RestController
public class EmissionController {

    @Autowired
    private EmissionRepository repository;

    @GetMapping("/api/emisiones") //El endpoint /api/emisiones devolverá en formato JSON la lista de todas las emisiones almacenadas en MongoDB.
    public List<Emission> getAllEmissions() {
        return repository.findAll();
    }
    
}
