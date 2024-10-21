package shadin.db_futbol.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class jugador {
    int equipoCod;
    String jugadorCod;
    String nombre;
    String apellidos;
    int demarcacion;
    int nacionalidad;
    int numeroCamiseta;
    int calidad;
    int velocidad;
    int vision;
    String nombreJugador;
    String descripcion;
}
