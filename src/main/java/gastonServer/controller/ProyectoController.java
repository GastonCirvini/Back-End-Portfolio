
package gastonServer.controller;

import gastonServer.model.Proyecto;
import gastonServer.service.IProyectoService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProyectoController {
    
    @Autowired
    private IProyectoService proy;
    
    @PostMapping ("/nuevo/proyecto")
    public void agregarProyecto (@RequestBody Proyecto pro) {
        proy.crearProyecto(pro);
    }
  
    @GetMapping ("/ver/proyecto")
    public List <Proyecto> verProyecto(){
        return proy.verProyecto();
    }
    @DeleteMapping ("/borrarProyecto/{id}")
    public void borrarProyecto (@PathVariable Long id){
        proy.borrarProyecto(id);
    }
  
    @PutMapping("/modificar/proyecto/{id}")
    public List <Proyecto> cambiarProyecto (@PathVariable Long id, @RequestBody @Valid Proyecto pro){
    
   Proyecto proyect = proy.buscarProyecto(id);
 
       proyect.setProyecto(pro.getProyecto());
   
   
       proyect.setProyecto1(pro.getProyecto1());
   
   
       proyect.setProyecto2(pro.getProyecto2());
   
   
       proyect.setProyecto3(pro.getProyecto3());
   
   
       proyect.setProyecto4(pro.getProyecto4());
   
   
       proyect.setProyecto5(pro.getProyecto5());
   
   
       proyect.setProyecto6(pro.getProyecto6());
   
   
       proyect.setTitulo(pro.getTitulo());
   
        proy.crearProyecto(proyect);
        return null;
    }
    
    
}
