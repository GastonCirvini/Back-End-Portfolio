
package gastonServer.controller;

import gastonServer.model.SoftsHard;
import gastonServer.service.ISoftsHardService;
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
public class SoftsHardController {
    
    @Autowired
    private ISoftsHardService sof;
    
    @PostMapping ("/nueva/soft")
    public void agregarSoft (@RequestBody SoftsHard sft) {
        sof.crearSoftsHard(sft);
        
    }

    @GetMapping ("/ver/soft")
    public List <SoftsHard> verSofts (){
       return sof.verSoftsHard();
    }
    
    @DeleteMapping ("/borrar/soft/{id}")
    public void borrarSoft (@PathVariable Long id){
        sof.borrarSoftsHard(id);
    }
    
    
    @PutMapping ("/modificar/soft/{id}")
    public List <SoftsHard> modificarSofts (@PathVariable Long id, @RequestBody @Valid SoftsHard softhard ){
        
        SoftsHard softh = sof.buscarSoftsHard(id);
     
       
            softh.setTrabajotitulo(softhard.getTrabajotitulo());
        
       
             softh.setComunicaciontitulo(softhard.getComunicaciontitulo());
         
         
              softh.setCreatividaddato(softhard.getCreatividaddato());
          
       
              softh.setAdaptaciontitulo(softhard.getAdaptaciontitulo());

          
       
              softh.setTrabajodato(softhard.getTrabajodato());
    
        
              softh.setComunicaciondato(softhard.getComunicaciondato());
    
         
              softh.setCreatividaddato(softhard.getCreatividaddato());
      
        
               softh.setAdaptaciondato(softhard.getAdaptaciondato());
           
             
           sof.crearSoftsHard(softh);
           return null;
                  
     
        
    }
    
}
