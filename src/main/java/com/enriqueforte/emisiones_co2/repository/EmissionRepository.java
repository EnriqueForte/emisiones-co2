package com.enriqueforte.emisiones_co2.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.enriqueforte.emisiones_co2.model.Emission;

public interface EmissionRepository extends MongoRepository<Emission, String> {
    // Se pueden definir metodos personalizados si se quiere, Springboot implementara la interfaz de forma automatica
}
