
package gastonServer.service;

import gastonServer.model.HardSkills;
import java.util.List;


public interface IHardSkillsService {
    List <HardSkills> verHard();
    void crearHard(HardSkills hard);
    void borrarHard(Long id);
    HardSkills buscarHardSkills (Long id);
}
