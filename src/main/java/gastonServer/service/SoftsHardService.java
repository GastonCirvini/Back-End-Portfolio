
package gastonServer.service;

import gastonServer.model.SoftsHard;
import gastonServer.repository.SoftsHardRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoftsHardService implements ISoftsHardService {

    @Autowired
    public SoftsHardRepository softshard;
    
    @Override
    public List<SoftsHard> verSoftsHard() {
    return softshard.findAll();
    }

    @Override
    public void crearSoftsHard(SoftsHard sf) {
       softshard.save(sf);
    }

    @Override
    public void borrarSoftsHard(Long id) {
     softshard.deleteById(id);
    }

    @Override
    public SoftsHard buscarSoftsHard(Long id) {
      return softshard.findById(id).orElse(null);
    }
    
}
