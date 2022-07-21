
package gastonServer.service;

import gastonServer.model.EducacionyExperiencia;
import gastonServer.repository.EducacionyExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EducacionyExperienciaService implements IEducacionyExperienciaService {
    
    @Autowired
    public EducacionyExperienciaRepository eduyexp;
    
   
    
    @Override
    public List<EducacionyExperiencia> verEducacionyExperiencia() {
       
            return eduyexp.findAll();
    }

    @Override
    public void crearEducacion(EducacionyExperiencia edu) {
       eduyexp.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
     eduyexp.deleteById(id);
    }

    @Override
    public EducacionyExperiencia buscarEducacion(Long id) {
      return eduyexp.findById(id).orElse(null);
    }


        
   
}
