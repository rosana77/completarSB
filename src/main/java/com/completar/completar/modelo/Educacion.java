
package com.completar.completar.modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
@Entity
@Table(name="educacion")  
public class Educacion {
    @Id
    private Long id;
    @Basic
    private String titulo;
    private String institucion;
    private String fecha;
    private String fin;
}
