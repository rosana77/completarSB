
package com.completar.completar.modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="skins") 
public class Skins {
    @Id
    private Long id;
    @Basic
    private String nombre;
    private String valor;
}
