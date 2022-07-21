
package gastonServer.controller;

import gastonServer.model.Cloudinary;
import gastonServer.model.Mensaje;
import gastonServer.service.Cloudinary2Service;
import gastonServer.service.CloudinaryService;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/cloudinary")
@CrossOrigin
public class CloudinaryController {
    
    
    @Autowired
    CloudinaryService cloudinaryservice;
    
    @Autowired
    Cloudinary2Service cloudinary2;
    
    @GetMapping("/list")
    public ResponseEntity<List<Cloudinary>> list (){
        List <Cloudinary>list = cloudinary2.list();
        return new ResponseEntity (list, HttpStatus.OK);
    }
    
    @PostMapping("/upload/{id}")
    public ResponseEntity<?> upload(@RequestParam MultipartFile multipartfile, @PathVariable int id) throws IOException{
        BufferedImage bi = ImageIO.read(multipartfile.getInputStream());
        if (bi == null){
            return new ResponseEntity (new Mensaje("Imagen no válida"), HttpStatus.BAD_REQUEST);
        }
        Map result = cloudinaryservice.upload(multipartfile);
        Cloudinary cloud = new Cloudinary((String)result.get("original_filename"),
                (String) result.get("url"),
                (String) result.get("public_id"));
        cloudinary2.save(cloud);
        return new ResponseEntity(new Mensaje("imagen subida a la nube"), HttpStatus.OK);
    }
    
     @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@RequestParam MultipartFile multipartfile, @PathVariable("id")int id) throws IOException{
        
        if(!cloudinary2.exists(id)){
            return new ResponseEntity (new Mensaje ("No existe"), HttpStatus.NOT_FOUND);
        }
        Cloudinary clou = cloudinary2.getOne(id).get();
        
        Map result = cloudinaryservice.delete(clou.getImagenId());
        
        cloudinary2.delete(id);
        return new ResponseEntity(new Mensaje ("Imagen eliminada"), HttpStatus.OK);
    }
    
    @PutMapping("/modificar/imagen/{id}")
    public  List <Cloudinary> modificar(@RequestParam MultipartFile multipartfile, @PathVariable int id) throws IOException{
        BufferedImage bi = ImageIO.read(multipartfile.getInputStream());
        Cloudinary clou = cloudinary2.getOne(id).get();
        
        
         
            
            
            cloudinary2.save(clou);
            
        
  
     //Map result = cloudinaryservice.upload(multipartfile);
        //Cloudinary cloud = new Cloudinary((String)result.
           //     get("original_filename"),
              //  (String) result.get("url"),
                //(String) result.get("public_id"));
        //cloudinary2.save(clou);
        
        return null;
        
    }
    
}
