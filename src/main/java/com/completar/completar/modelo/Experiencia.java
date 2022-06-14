
package com.completar.completar.modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="experiencia")  
public class Experiencia {
    @Id
    private Long id;
    @Basic
    private String empresa;
    private String fecha;
    private String fin;
    private String descripcion;
}




