
package com.completar.completar.service;

import com.completar.completar.modelo.Experiencia;
import com.completar.completar.repository.experienciaReposity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
   @Autowired
    private experienciaReposity expReposity;
    
    @Override
    public List<Experiencia> getExperiencia () {
        List<Experiencia> listaExperiencia = expReposity.findAll();
        return listaExperiencia; 
}}



    
 