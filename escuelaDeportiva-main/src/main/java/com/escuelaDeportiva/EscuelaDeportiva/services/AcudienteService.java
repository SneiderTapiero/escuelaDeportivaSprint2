package com.escuelaDeportiva.EscuelaDeportiva.services;

import java.util.List;

import com.escuelaDeportiva.EscuelaDeportiva.models.AcudienteModel;
import com.escuelaDeportiva.EscuelaDeportiva.repositories.AcudienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcudienteService {

    @Autowired
    AcudienteRepository acudienteRepository;

    public void guardarAcudiente(AcudienteModel acudiente) {
        this.acudienteRepository.save(acudiente);
    }

    public List<AcudienteModel> obtenerAcudiente() {
        return this.acudienteRepository.findAll();
    }

}
