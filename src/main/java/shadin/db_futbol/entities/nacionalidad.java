package shadin.db_futbol.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Setter
public class nacionalidad {
    @Id
    @GeneratedValue
    String nac_cod;
    String nacionalidad;


}
