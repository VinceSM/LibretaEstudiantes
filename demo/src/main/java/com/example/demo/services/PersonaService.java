package com.example.demo.services;

import com.example.demo.model.Persona;
import com.example.demo.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    private final PersonaRepository personaRepository;

    @Autowired
    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public Persona createPersona(Persona persona) {
        // Agregar lógica de validación si es necesario
        return personaRepository.save(persona);
    }

    public Optional<Persona> obtenerPersonaPorId(Long id) {
        return personaRepository.findById(id);
    }

    public List<Persona> obtenerTodasLasPersonas() {
        return personaRepository.findAll();
    }

    public Persona actualizarPersona(Long id, Persona nuevaPersona) {
        // Agregar lógica de validación si es necesario
        Optional<Persona> personaExistente = personaRepository.findById(id);
        if (personaExistente.isPresent()) {
            Persona personaActual = personaExistente.get();
            // Actualizar los campos de la persona actual con los valores de la nuevaPersona
            personaActual.setNombre(nuevaPersona.getNombre());
            // Actualiza otros campos si es necesario
            return personaRepository.save(personaActual);
        } else {
            // Manejar el caso en el que la persona no se encuentra
            return null; // o lanza una excepción, según tu preferencia
        }
    }

    public void eliminarPersona(Long id) {
        // Agregar lógica de validación si es necesario
        personaRepository.deleteById(id);
    }
}
