package com.example.demo.repositories;

import com.example.demo.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public class PersonaRepository {
    public Persona save(Persona persona) {
        return persona;
    }

    public Optional<Persona> findById(Long id) {
        return null;
    }

    public List<Persona> findAll() {
        return null;
    }

    public void deleteById(Long id) {
    }

    public interface personaRepository extends JpaRepository<Persona, Long> {

    }
}
