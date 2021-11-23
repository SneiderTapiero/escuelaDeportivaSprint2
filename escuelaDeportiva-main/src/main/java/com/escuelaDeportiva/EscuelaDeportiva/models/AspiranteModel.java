package com.escuelaDeportiva.EscuelaDeportiva.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "aspirantes")
public class AspiranteModel {

    @Id
    private String id;
    
    private String nombre;
    private String apellidos;
    private String fechanaci;
    private String sexo;
    private AcudienteModel acudientes;
    private UsuarioModel usuarios;

    
    
    public AcudienteModel getAcudientes() {
        return acudientes;
    }
    public void setAcudientes(AcudienteModel acudientes) {
        this.acudientes = acudientes;
    }
    public UsuarioModel getUsuarios() {
        return usuarios;
    }
    public void setUsuarios(UsuarioModel usuarios) {
        this.usuarios = usuarios;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getFechanaci() {
        return fechanaci;
    }
    public void setFechanaci(String fechanaci) {
        this.fechanaci = fechanaci;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    

    
    
 


    

    
    
}
