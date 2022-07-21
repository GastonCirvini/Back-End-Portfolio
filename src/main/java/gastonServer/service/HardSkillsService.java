/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gastonServer.service;

import gastonServer.model.HardSkills;
import gastonServer.repository.HardSkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class HardSkillsService implements IHardSkillsService {

    @Autowired
    public HardSkillsRepository hardskill;
    
    @Override
    public List<HardSkills> verHard() {
    return hardskill.findAll();
    }

    @Override
    public void crearHard(HardSkills hard) {
     hardskill.save(hard);
    }

    @Override
    public void borrarHard(Long id) {
        hardskill.deleteById(id);
    }

    @Override
    public HardSkills buscarHardSkills(Long id) {
      return hardskill.findById(id).orElse(null);
    }
    
}
