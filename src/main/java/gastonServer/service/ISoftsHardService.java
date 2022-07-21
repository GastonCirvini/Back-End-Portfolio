
package gastonServer.service;

import gastonServer.model.SoftsHard;
import java.util.List;


public interface ISoftsHardService {
List <SoftsHard> verSoftsHard();

void crearSoftsHard (SoftsHard sf);
void borrarSoftsHard (Long id);
SoftsHard buscarSoftsHard(Long id);
}
