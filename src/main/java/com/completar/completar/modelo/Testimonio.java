
package com.completar.completar.modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name="testimonios")
public class Testimonio {
    @Id
    private Long id;
    @Basic
    private String nombre;
    private String cargo;
    private String descripcion;
}
