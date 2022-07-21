
package gastonServer.repository;

import gastonServer.model.Titulos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TitulosRepository extends JpaRepository <Titulos, Long> {
    
}
