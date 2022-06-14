
package com.completar.completar.controlador;

import com.completar.completar.modelo.Datos;
import com.completar.completar.modelo.Educacion;
import com.completar.completar.modelo.Experiencia;
import com.completar.completar.modelo.Formulario;
import com.completar.completar.modelo.Inicio;
import com.completar.completar.modelo.Servicios;
import com.completar.completar.modelo.Skins;
import com.completar.completar.modelo.Testimonio;
import com.completar.completar.service.IDatosService;
import com.completar.completar.service.IEducacionService;
import com.completar.completar.service.IExperienciaService;
import com.completar.completar.service.IFormularioService;
import com.completar.completar.service.IInicioService;
import com.completar.completar.service.IServiciosService;
import com.completar.completar.service.ISkinsService;
import com.completar.completar.service.ITestimonioService;
import static java.lang.ProcessBuilder.Redirect.from;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controladora {
    @Autowired
    private IEducacionService interEducacion;
    @CrossOrigin(origins = "http://localhost:4200/")      
    @GetMapping ("api/educacion")
    public List<Educacion> getEducacion() {
        return interEducacion.getEducacion();
    }
    @Autowired
    private IExperienciaService interExperiencia;
    @CrossOrigin(origins = "http://localhost:4200/")
    @GetMapping ("api/experiencia")
    public List<Experiencia> getExperiencia() {
        return interExperiencia.getExperiencia();
    }
    @Autowired
    private ISkinsService interSkins;
    @CrossOrigin(origins = "http://localhost:4200/")
    @GetMapping ("api/skins")
    public List<Skins> getSkins() {
        return interSkins.getSkins();
    }
    @Autowired
    private ITestimonioService interTestimonio;
    @CrossOrigin(origins = "http://localhost:4200/")
    @GetMapping ("api/testimonio")
    public List<Testimonio> getTestimonio() {
        return interTestimonio.getTestimonio();
    }
    @Autowired
    private IServiciosService interServicios;
    @CrossOrigin(origins = "http://localhost:4200/")
    @GetMapping ("api/servicios")
    public List<Servicios> getServicios() {
        return interServicios.getServicios();
    }
    @Autowired
    private IDatosService interDatos;
    @CrossOrigin(origins = "http://localhost:4200/")
    @GetMapping ("api/datos")
    public List<Datos> getDatos() {
        return interDatos.getDatos();
    }
    
    @Autowired
    private IFormularioService forSer;
    @CrossOrigin(origins = "http://localhost:4200/")
    @PostMapping ("api/formulario")
    public void nuevoContacto(@RequestBody Formulario formu) {
        forSer.nuevoFormulario(formu);
    }
    @CrossOrigin(origins = "http://localhost:4200/")
    @GetMapping ("api/mensajes")
    @ResponseBody
    public List<Formulario> verMensajes() {
        return forSer.getFormulario();
    }
    @CrossOrigin(origins = "http://localhost:4200/")
    @DeleteMapping("api/delete/{id}")
    public void borrarMensaje (@PathVariable Long id){
        forSer.borrarFormulario(id);
    }
                
         
    
    @Autowired
    private IInicioService iniSer;
    @CrossOrigin(origins = "http://localhost:4200/inicio")
    @GetMapping ("api/usuario")
    @ResponseBody
    public List<Inicio> verInicio() {
        return iniSer.getInicio();
    }
    @CrossOrigin(origins = "http://localhost:4200/")
    @PostMapping ("api/inicio")
    public void nuevoContacto(@RequestBody Inicio ini) {
       iniSer.nuevoInicio(ini);
    }
    @GetMapping ("/saludo")      
    public String saludar() {
        return "Hola Maquinola";
    }
    }
       
    
