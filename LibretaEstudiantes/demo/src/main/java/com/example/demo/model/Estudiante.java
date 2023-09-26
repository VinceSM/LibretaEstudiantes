package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Estudiante {
    @Id
    @GeneratedValue
    private Long idEstudiante;
    private Long idPersona;

}
