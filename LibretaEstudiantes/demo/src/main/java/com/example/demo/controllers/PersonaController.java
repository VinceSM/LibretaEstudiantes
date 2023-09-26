package com.example.demo.controllers;

import com.example.demo.model.Persona;
import com.example.demo.services.PersonaService;
import com.example.demo.DTOS.PersonaRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    private final PersonaService personaService;

    @Autowired
    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @PostMapping
    public Persona crearPersona(@RequestBody PersonaRequest request) {
        return personaService.createPersona((Persona) request);
    }

    @GetMapping("/{id}")
    public Persona obtenerPersonaPorId(@PathVariable Long id) {
        // Lógica para obtener una persona por su ID
        return null;
    }

    @PutMapping("/{id}")
    public Persona actualizarPersona(@PathVariable Long id, @RequestBody PersonaRequest request) {
        // Lógica para actualizar una persona por su ID
        return null;
    }

    @DeleteMapping("/{id}")
    public void eliminarPersona(@PathVariable Long id) {
        // Lógica para eliminar una persona por su ID
    }
}
