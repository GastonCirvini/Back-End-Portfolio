
package gastonServer.controller;

import gastonServer.model.HardSkills;
import gastonServer.model.Imagenes;
import gastonServer.service.IHardSkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HardSkillsController {

   @Autowired
   private IHardSkillsService hardy;
        
     @GetMapping ("/ver/hard")
    public List <HardSkills> verSkillsHard(){
        return hardy.verHard();
    }
    
    @PostMapping ("/nueva/hard")
    public void agregarSkillHard(@RequestBody HardSkills jard){
        hardy.crearHard(jard);
        
    }
    
    @DeleteMapping ("/borrar/hard/{id}")
    public void borrarSkillsHard (@PathVariable Long id){
        hardy.borrarHard(id);
    }
    
    @PutMapping ("/modificar/hard/{id}")
    public List <HardSkills> modificarSkillsHard ( @PathVariable Long id, @RequestBody HardSkills jard){
        HardSkills hardskill = hardy.buscarHardSkills(id);
        
        hardskill.setJavaScript(jard.getJavaScript());
        hardskill.setAngular(jard.getAngular());
        hardskill.setHtml(jard.getHtml());
        hardskill.setCss(jard.getCss());
        hardskill.setBootstrap(jard.getBootstrap());
        hardskill.setJava(jard.getJava());
        hardskill.setSpringboot(jard.getSpringboot());
        hardskill.setMysql(jard.getMysql());
        
        hardy.crearHard(jard);
        
        return null;
   
        
    }
   
   
   
}
