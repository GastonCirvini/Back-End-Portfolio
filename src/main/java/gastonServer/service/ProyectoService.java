
package gastonServer.service;

import gastonServer.model.Proyecto;
import gastonServer.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {
    
    @Autowired
    public ProyectoRepository proyect;
        
    @Override
    public List<Proyecto> verProyecto() {
       return proyect.findAll();
    }

    @Override
    public void crearProyecto(Proyecto proyecto) {
        proyect.save(proyecto);
    }

    @Override
    public void borrarProyecto(Long id) {
       proyect.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return proyect.findById(id).orElse(null);
    }
    
    
}
