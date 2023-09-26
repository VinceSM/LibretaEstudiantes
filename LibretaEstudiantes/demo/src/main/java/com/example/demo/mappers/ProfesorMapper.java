package com.example.demo.mappers;

import com.example.demo.DTOS.ProfesorDTO;
import com.example.demo.model.Profesor;
import org.springframework.stereotype.Component;

@Component
public class ProfesorMapper {

    public ProfesorDTO profesorToDTO(Profesor profesor) {
        ProfesorDTO dto = new ProfesorDTO();
        dto.setIdProfesor(profesor.getIdProfesor());
        dto.setNombre(profesor.getNombre());
        dto.setApellido(profesor.getApellido());
        dto.setDNI(profesor.getDNI());
        // Asigna otros atributos si es necesario
        return dto;
    }

    public Profesor dtoToProfesor(ProfesorDTO dto) {
        Profesor profesor = new Profesor();
        profesor.setIdProfesor(dto.getIdProfesor());
        profesor.setNombre(dto.getNombre());
        profesor.setApellido(dto.getApellido());
        profesor.setDNI(dto.getDNI());
        // Asigna otros atributos si es necesario
        return profesor;
    }
}
