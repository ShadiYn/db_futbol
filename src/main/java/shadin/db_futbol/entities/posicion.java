package shadin.db_futbol.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class posicion {
    String cod_demarc;
    String demarcacion;
}
