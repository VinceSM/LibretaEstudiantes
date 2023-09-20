package com.example.demo.repositories;

import com.example.demo.model.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public class MateriaRepository {
    public Materia save(Materia materia) {
        return materia;
    }

    public Optional<Materia> findById(Long id) {
        return null;
    }

    public List<Materia> findAll() {
        return null;
    }

    public void deleteById(Long id) {
    }

    public interface materiaRepository extends JpaRepository<Materia, Long> {

    }
}

