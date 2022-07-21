
package gastonServer.service;

import gastonServer.model.Imagenes;
import gastonServer.repository.ImagenesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImagenesService implements IImagenesService {

    @Autowired
    public ImagenesRepository imagen;
        
    @Override
    public List<Imagenes> verImagenes() {
    return imagen.findAll();
    }

    @Override
    public void cambiarImagenes(Imagenes img) {
       imagen.save(img);
    }

    @Override
    public void borrarImagenes(Long id) {
      imagen.deleteById(id);
    }

    @Override
    public Imagenes buscarImagenes(Long id) {
     return  imagen.findById(id).orElse(null);
    }

    @Override
    public void save(MultipartFile imagen) {
      imagen.getResource();
    }
    
}
