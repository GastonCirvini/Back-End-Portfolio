
package gastonServer.service;

import gastonServer.model.Presentacion;
import gastonServer.repository.PresentacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PresentacionService implements IPresentacionService {
    
    @Autowired
    public PresentacionRepository pres;

    @Override
    public List<Presentacion> verPresentacion() {
       return pres.findAll();
    }

    @Override
    public void crearPresentacion(Presentacion presentacion) {
     pres.save(presentacion);
    }

    @Override
    public void borrarPresentacion(Long id) {
        pres.deleteById(id);
    }

    @Override
    public Presentacion buscarPresentacion(Long id) {
       return pres.findById(id).orElse(null);
    }
}
