
package com.completar.completar.service;

import com.completar.completar.modelo.Servicios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.completar.completar.repository.serviciosReposity;

@Service
public class ServiciosService implements IServiciosService{
    @Autowired
    private serviciosReposity serviciosService;
    
    @Override
    public List<Servicios> getServicios () {
        List<Servicios> listaServicios = serviciosService.findAll();
        return listaServicios; 
}
}
