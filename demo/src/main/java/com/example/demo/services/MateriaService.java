package com.example.demo.services;

import com.example.demo.model.Materia;
import com.example.demo.repositories.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaService {

    private final MateriaRepository materiaRepository;

    @Autowired
    public MateriaService(MateriaRepository materiaRepository) {
        this.materiaRepository = materiaRepository;
    }

    public Materia createMateria(Materia materia) {
        // Agregar lógica de validación si es necesario
        return materiaRepository.save(materia);
    }

    public Optional<Materia> obtenerMateriaPorId(Long id) {
        return materiaRepository.findById(id);
    }

    public List<Materia> obtenerTodasLasMaterias() {
        return materiaRepository.findAll();
    }

    public Materia actualizarMateria(Long id, Materia nuevaMateria) {
        // Agregar lógica de validación si es necesario
        Optional<Materia> materiaExistente = materiaRepository.findById(id);
        if (materiaExistente.isPresent()) {
            Materia materiaActual = materiaExistente.get();
            // Actualizar los campos de la materia actual con los valores de la nuevaMateria
            materiaActual.setNombre(nuevaMateria.getNombre());
            // Actualiza otros campos si es necesario
            return materiaRepository.save(materiaActual);
        } else {
            // Manejar el caso en el que la materia no se encuentra
            return null; // o lanza una excepción, según tu preferencia
        }
    }

    public void eliminarMateria(Long id) {
        // Agregar lógica de validación si es necesario
        materiaRepository.deleteById(id);
    }
}
