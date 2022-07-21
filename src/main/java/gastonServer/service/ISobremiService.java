
package gastonServer.service;

import gastonServer.model.Sobremi;
import java.util.List;



public interface ISobremiService {
    List <Sobremi> verSobremi ();
    
    void crearTexto (Sobremi sob);
    void borrarTexto (Long id);
    Sobremi buscarSobremi(Long id);
    
}
