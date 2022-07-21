/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gastonServer.service;

import gastonServer.model.Cloudinary;
import gastonServer.repository.CloudinaryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class Cloudinary2Service {
    
    @Autowired
    CloudinaryRepository cloudinaryrepository;
    
    public List <Cloudinary> list (){
        return cloudinaryrepository.findByOrderById();
    }
    
    public Optional <Cloudinary>getOne(int id){
        return cloudinaryrepository.findById(id);
    }
    
    
    public void save(Cloudinary cloudinary ){
        cloudinaryrepository.save(cloudinary);
        
    }
    
    public void delete(int id){
        cloudinaryrepository.deleteById(id);
    }
    
    public boolean exists(int id){
        return cloudinaryrepository.existsById(id);
    }
    
}
