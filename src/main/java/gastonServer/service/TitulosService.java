
package gastonServer.service;

import gastonServer.model.Titulos;
import gastonServer.repository.TitulosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TitulosService implements ITitulosService {
    
    @Autowired
    public TitulosRepository tit;
        
    @Override
    public List<Titulos> verTitulos() {
     return  tit.findAll();
    }

    @Override
    public void crearTitulos(Titulos titulos) {
       tit.save(titulos);
    }

    @Override
    public void borrarTitulos(Long id) {
        tit.deleteById(id);
    }

    @Override
    public Titulos buscarTitulos(Long id) {
        return tit.findById(id).orElse(null);
    }
    
    
}
