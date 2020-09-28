package com.example.persona.services;

import com.example.persona.entities.Autor;
import com.example.persona.entities.Localidad;
import com.example.persona.entities.Persona;
import com.example.persona.repositories.AutorRepository;
import com.example.persona.repositories.BaseRepository;
import com.example.persona.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{

    @Autowired
    private AutorRepository personaRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
    }
}
