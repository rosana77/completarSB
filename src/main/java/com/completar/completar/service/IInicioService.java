
package com.completar.completar.service;

import com.completar.completar.modelo.Inicio;
import java.util.List;


public interface IInicioService {
    public List<Inicio> getInicio ();
        
    public void nuevoInicio(Inicio ini);
    
    public void borrarInicio (Long id);
    
    public Inicio buscarInicio (Long id);
}
