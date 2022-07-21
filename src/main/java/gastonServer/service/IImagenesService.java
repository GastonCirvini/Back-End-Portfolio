
package gastonServer.service;

import gastonServer.model.Imagenes;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;


public interface IImagenesService {
    List <Imagenes> verImagenes();
    
    void cambiarImagenes (Imagenes imagen);
    void borrarImagenes (Long id);
    Imagenes buscarImagenes (Long id);
    public void save(MultipartFile imagen);
}
