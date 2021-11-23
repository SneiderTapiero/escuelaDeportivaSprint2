package com.escuelaDeportiva.EscuelaDeportiva.repositories;


import com.escuelaDeportiva.EscuelaDeportiva.models.UsuarioModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends MongoRepository<UsuarioModel,String>{


}