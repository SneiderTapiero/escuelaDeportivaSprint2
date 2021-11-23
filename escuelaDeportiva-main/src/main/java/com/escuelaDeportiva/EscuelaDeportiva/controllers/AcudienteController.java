package com.escuelaDeportiva.EscuelaDeportiva.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import com.escuelaDeportiva.EscuelaDeportiva.models.AcudienteModel;
import com.escuelaDeportiva.EscuelaDeportiva.services.AcudienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AcudienteController {

    @Autowired
    AcudienteService acudienteService;

    @PostMapping("/acudiente")
    public ResponseEntity<Map<String, String>> guardar(@Valid @RequestBody AcudienteModel acudiente) {
        this.acudienteService.guardarAcudiente(acudiente);
        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("mensaje", "Se ha agregado al acudiente correctamente");
        return ResponseEntity.ok(respuesta);
    }

    @GetMapping("/acudiente")
    public List<AcudienteModel> mostrar() {
        return this.acudienteService.obtenerAcudiente();
    }

}
