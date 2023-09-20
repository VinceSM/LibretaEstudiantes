package com.example.demo.controllers;

import com.example.demo.model.Materia;
import com.example.demo.services.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/materias")
public class MateriaController {

    private final MateriaService materiaService;

    @Autowired
    public MateriaController(MateriaService materiaService) {
        this.materiaService = materiaService;
    }

    @PostMapping
    public Materia crearMateria(@RequestBody Materia materia) {
        return materiaService.createMateria(materia);
    }

    @GetMapping("/{id}")
    public Materia obtenerMateriaPorId(@PathVariable Long id) {
        // Lógica para obtener una materia por su ID
        return null;
    }

    @PutMapping("/{id}")
    public Materia actualizarMateria(@PathVariable Long id, @RequestBody Materia materia) {
        // Lógica para actualizar una materia por su ID
        return materia;
    }

    @DeleteMapping("/{id}")
    public void eliminarMateria(@PathVariable Long id) {
        // Lógica para eliminar una materia por su ID
    }
}

