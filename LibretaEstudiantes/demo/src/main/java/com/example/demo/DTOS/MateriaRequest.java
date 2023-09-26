package com.example.demo.DTOS;

import lombok.Data;

@Data
public class MateriaRequest {
    private String nombre;
    private String anio;
    private Long idCarrera;
    private Long idProfesor;
    // Otros atributos si son necesarios
}
