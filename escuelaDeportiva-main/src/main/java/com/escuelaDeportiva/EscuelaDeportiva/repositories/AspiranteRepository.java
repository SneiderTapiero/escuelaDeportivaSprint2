package com.escuelaDeportiva.EscuelaDeportiva.repositories;

import com.escuelaDeportiva.EscuelaDeportiva.models.AspiranteModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AspiranteRepository extends MongoRepository<AspiranteModel, String>{
    
}
