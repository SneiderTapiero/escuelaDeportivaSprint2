package com.escuelaDeportiva.EscuelaDeportiva.repositories;

import com.escuelaDeportiva.EscuelaDeportiva.models.AcudienteModel;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AcudienteRepository extends MongoRepository<AcudienteModel, String> {

}
