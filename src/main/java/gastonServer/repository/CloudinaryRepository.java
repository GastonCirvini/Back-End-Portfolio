
package gastonServer.repository;

import gastonServer.model.Cloudinary;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CloudinaryRepository extends JpaRepository<Cloudinary, Integer> {
    List<Cloudinary> findByOrderById();
    
    
    
}
