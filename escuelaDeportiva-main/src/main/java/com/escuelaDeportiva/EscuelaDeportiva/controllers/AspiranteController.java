package com.escuelaDeportiva.EscuelaDeportiva.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import com.escuelaDeportiva.EscuelaDeportiva.models.AspiranteModel;
import com.escuelaDeportiva.EscuelaDeportiva.services.AspiranteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AspiranteController {

    @Autowired
    AspiranteService aspiranteService;

    @PostMapping("/aspirantes")
    public ResponseEntity<Map<String, String>> guardar(@Valid @RequestBody AspiranteModel aspirante){
        this.aspiranteService.guardarAspirante(aspirante);
        Map<String, String> respuesta=new HashMap<>();
        respuesta.put("mensaje", "Se agrego el equipo correctamente");
        return ResponseEntity.ok(respuesta);
    }
    
}
