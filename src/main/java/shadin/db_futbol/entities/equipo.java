package shadin.db_futbol.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class equipo {
    @Id
    @GeneratedValue
    int equipo_cod;
    String nombre;
    String fundacion;
    String presidente;
    int presupuesto;
    String equipacion;
    String foto_equipo;
    String foto_escudo;
    String pagina_web;

}
