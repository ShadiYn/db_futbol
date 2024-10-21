package shadin.db_futbol.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import shadin.db_futbol.entities.equipo;
import shadin.db_futbol.repositories.EquipoRepository;

import java.util.List;

public class equipoController {

    @Autowired
    private EquipoRepository invitadoRepository;



    @GetMapping
    public List<equipo> selectPeople() {
        List<equipo> people = invitadoRepository.findAll();
        return people;
    }
}
