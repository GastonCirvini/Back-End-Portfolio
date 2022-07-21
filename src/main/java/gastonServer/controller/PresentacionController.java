
package gastonServer.controller;

import gastonServer.model.Presentacion;
import gastonServer.service.IPresentacionService;
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
public class PresentacionController {
    
    @Autowired
    private IPresentacionService presentacion;
    
    @PostMapping ("/nueva/presentacion")
    public void agregarPresentacion (@RequestBody Presentacion pres) {
        presentacion.crearPresentacion(pres);
    }
    
    @GetMapping ("/ver/presentacion")
    public List <Presentacion> verPresentacion (){
        return presentacion.verPresentacion();
        
    }
    @DeleteMapping ("/borrar/presentacion/{id}")
    public void borrarPresentacion (@PathVariable Long id){
        presentacion.borrarPresentacion(id);
    }
    
    @PutMapping ("/modificar/presentacion/{id}")
    public List <Presentacion> modificarPresentacion (@PathVariable Long id, @RequestBody @Valid Presentacion prese ) {
        
        Presentacion presi = presentacion.buscarPresentacion(id);
  
       presi.setEdad(prese.getEdad());

  
       presi.setEmail(prese.getEmail());

 
       presi.setEstudios(prese.getEstudios());

  
       presi.setEstudios2(prese.getEstudios2());

  
       presi.setEstudios3(prese.getEstudios3());

       presi.setEstudios4(prese.getEstudios4());
  
       presi.setNacimiento(prese.getNacimiento());


       presi.setNombreytitulo(prese.getNombreytitulo());


       presi.setResidencia(prese.getResidencia());

        
   presentacion.crearPresentacion(presi);
        return null;
    }
    
    
}
