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
public class Profesor extends PersonaRequest{

    @Id
    @GeneratedValue
    private long idProfesor;
    private long idPersona;
}
