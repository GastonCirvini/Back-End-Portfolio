
package gastonServer.repository;

import gastonServer.model.Imagenes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagenesRepository extends JpaRepository <Imagenes, Long>  {
    
}
