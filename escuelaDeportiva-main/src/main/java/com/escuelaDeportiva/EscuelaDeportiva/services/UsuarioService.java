package com.escuelaDeportiva.EscuelaDeportiva.services;

import com.escuelaDeportiva.EscuelaDeportiva.models.UsuarioModel;
import com.escuelaDeportiva.EscuelaDeportiva.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    
    @Autowired
    UsuarioRepository usuarioRepository;

    //Método para guardar usuario
    public void guardarUsuario(UsuarioModel usuario) {
        this.usuarioRepository.save(usuario);
    }



}

