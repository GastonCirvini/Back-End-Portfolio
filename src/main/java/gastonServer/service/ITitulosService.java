
package gastonServer.service;

import gastonServer.model.Titulos;
import java.util.List;


public interface ITitulosService {
    List <Titulos> verTitulos();
    void crearTitulos (Titulos titulos);
    void borrarTitulos (Long id);
    Titulos buscarTitulos (Long id);
    
}
