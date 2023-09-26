package com.example.demo.controllers;

import com.example.demo.model.Profesor;
import com.example.demo.services.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/profesores")
public class ProfesorController {

    private final ProfesorService profesorService;

    @Autowired
    public ProfesorController(ProfesorService profesorService) {
        this.profesorService = profesorService;
    }

    @PostMapping
    public Profesor crearProfesor(@RequestBody Profesor profesor) {
        return profesorService.createProfesor(profesor);
    }

    @GetMapping("/{id}")
    public Optional<Profesor> obtenerProfesorPorId(@PathVariable Long id) {
        return profesorService.obtenerProfesorPorId(id);
    }

    @GetMapping
    public List<Profesor> obtenerTodosLosProfesores() {
        return profesorService.obtenerTodosLosProfesores();
    }

    @PutMapping("/{id}")
    public Profesor actualizarProfesor(@PathVariable Long id, @RequestBody Profesor profesor) {
        return profesorService.actualizarProfesor(id, profesor);
    }

    @DeleteMapping("/{id}")
    public void eliminarProfesor(@PathVariable Long id) {
        profesorService.eliminarProfesor(id);
    }
}
