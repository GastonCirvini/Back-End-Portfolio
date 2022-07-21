
package gastonServer.service;

import gastonServer.model.Presentacion;
import java.util.List;


public interface IPresentacionService {
    List <Presentacion> verPresentacion();
    
    void crearPresentacion (Presentacion presentacion);
    void borrarPresentacion (Long id);
    Presentacion buscarPresentacion (Long id);
    
}
