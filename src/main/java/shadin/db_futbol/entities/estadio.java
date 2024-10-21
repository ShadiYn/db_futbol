package shadin.db_futbol.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class estadio {
    int equipo_cod;
    int estadioCod;
    String nombre;
    String direccion;
    int construccion;
    int aforo;
    String fotoEstadio;

}
