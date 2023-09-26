package com.example.demo.mappers;

import com.example.demo.DTOS.MateriaDTO;
import com.example.demo.model.Materia;
import org.springframework.stereotype.Component;

@Component
public class MateriaMapper {

    public MateriaDTO materiaToDTO(Materia materia) {
        MateriaDTO dto = new MateriaDTO();
        dto.setIdMateria(materia.getIdMateria());
        dto.setNombre(materia.getNombre());
        dto.setAnio(materia.getAnio());
        dto.setIdCarrera(materia.getIdCarrera());
        dto.setIdProfesor(materia.getIdProfesor());
        // Asigna otros atributos si es necesario
        return dto;
    }

    public Materia dtoToMateria(MateriaDTO dto) {
        Materia materia = new Materia();
        materia.setIdMateria(dto.getIdMateria());
        materia.setNombre(dto.getNombre());
        materia.setAnio(dto.getAnio());
        materia.setIdCarrera(dto.getIdCarrera());
        materia.setIdProfesor(dto.getIdProfesor());
        // Asigna otros atributos si es necesario
        return materia;
    }
}
