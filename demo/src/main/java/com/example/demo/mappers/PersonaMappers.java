package com.example.demo.mappers;

import com.example.demo.model.Persona;
import com.example.demo.DTOS.PersonaRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonaMappers {

    public Persona personaRequestToPersona(PersonaRequest request) {
        Persona persona = new Persona();
        persona.setNombre(request.getNombre());
        // Asigna otros campos de la persona desde la solicitud si es necesario
        return persona;
    }
}


