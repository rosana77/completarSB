
package com.completar.completar.service;

import com.completar.completar.modelo.Inicio;
import com.completar.completar.repository.inicioReposity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class InicioService implements IInicioService{
    
    @Autowired
    private inicioReposity iniReposity;
        
  
    @Override
    public List<Inicio> getInicio() {
        return iniReposity.findAll();
    }

    @Override
    public void nuevoInicio(Inicio ini) {
        iniReposity.save(ini);
    }

    @Override
    public void borrarInicio(Long id) {
        iniReposity.deleteById(id ); ;
                              
    }

    @Override
    public Inicio buscarInicio(Long id) {
        return iniReposity.findById(id).orElse(null);
    }

    
}
