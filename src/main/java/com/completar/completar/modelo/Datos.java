
package com.completar.completar.modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
@Entity
@Table (name="datos")
public class Datos {
    @Id
    private Long id;
    @Basic
    private String nombre;
    private String direccion;
    private String telefono;
    private String mail;
    private String interes;
    private String disponibilidad;
    private String especialidad;
    private String objetivo;
    }
