package shadin.db_futbol.repositories;

import shadin.db_futbol.entities.equipo;

import java.util.List;

public interface EquipoRepository {
    List<equipo> findAll();
}
