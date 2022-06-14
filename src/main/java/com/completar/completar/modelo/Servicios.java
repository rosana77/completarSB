
package com.completar.completar.modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table (name="servicios")
public class Servicios {
    @Id
    private Long id;
    @Basic
    private String icono;
    private String nombre;
    private String descripcion;
}
