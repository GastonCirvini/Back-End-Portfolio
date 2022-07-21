
package gastonServer.service;

import gastonServer.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    List <Proyecto> verProyecto();
    
    void crearProyecto (Proyecto proyecto);
    void borrarProyecto (Long id);
    Proyecto buscarProyecto (Long id);
    
    
}
