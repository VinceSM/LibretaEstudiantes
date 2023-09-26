package com.example.demo.repositories;

import com.example.demo.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
    // Puedes agregar métodos personalizados para consultas específicas si es necesario
}
