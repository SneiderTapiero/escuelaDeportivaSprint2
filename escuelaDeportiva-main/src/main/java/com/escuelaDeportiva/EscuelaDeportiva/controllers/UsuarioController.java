package com.escuelaDeportiva.EscuelaDeportiva.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import com.escuelaDeportiva.EscuelaDeportiva.models.UsuarioModel;
import com.escuelaDeportiva.EscuelaDeportiva.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/usuario")
    public ResponseEntity<Map<String, String>> guardar(@Valid @RequestBody UsuarioModel usuario){
        this.usuarioService.guardarUsuario(usuario);
        Map<String, String> respuesta=new HashMap<>();
        respuesta.put("mensaje", "Se agrego el usuario correctamente");
        return ResponseEntity.ok(respuesta);
    }
     

}