
package gastonServer.service;

import gastonServer.model.EducacionyExperiencia;
import java.util.List;


public interface IEducacionyExperienciaService {
    List <EducacionyExperiencia> verEducacionyExperiencia();
    void crearEducacion (EducacionyExperiencia edu);
    void borrarEducacion (Long id);
    EducacionyExperiencia buscarEducacion (Long id);
    

}
