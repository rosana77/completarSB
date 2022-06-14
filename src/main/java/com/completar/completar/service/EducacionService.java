
package com.completar.completar.service;

import com.completar.completar.modelo.Educacion;
import com.completar.completar.repository.educacionReposity;
import static java.lang.System.console;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
    @Autowired
    private educacionReposity eduReposity;
    
    @Override
    public List<Educacion> getEducacion () {
        List<Educacion> listaEducacion = eduReposity.findAll();
        return listaEducacion;
        
    }
}
