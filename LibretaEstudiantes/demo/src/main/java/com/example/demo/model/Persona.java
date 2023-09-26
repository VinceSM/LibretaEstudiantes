package com.example.demo.model;

import com.example.demo.DTOS.PersonaRequest;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Persona extends PersonaRequest {

    @Id
    @GeneratedValue
    private Long idPersona;
    private String nombre;
    private String apellido;
    private String DNI;
    private String telefono;
    private String mail;
    private String direccion;
}
