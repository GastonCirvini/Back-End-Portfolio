
package gastonServer.service;

import gastonServer.model.Sobremi;
import gastonServer.repository.SobremiRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SobremiService implements ISobremiService {

    @Autowired
    public SobremiRepository sobre;
    
    
    @Override
    public List<Sobremi> verSobremi() {
      return sobre.findAll();
    }

    @Override
    public void crearTexto(Sobremi sob) {
       sobre.save(sob);
    }

    @Override
    public void borrarTexto(Long id) {
       sobre.deleteById(id);
    }

    @Override
    public Sobremi buscarSobremi(Long id) {
      return sobre.findById(id).orElse(null);
    }
    
 
    
    
    
}
