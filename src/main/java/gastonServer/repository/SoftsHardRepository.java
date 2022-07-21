
package gastonServer.repository;

import gastonServer.model.SoftsHard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SoftsHardRepository extends JpaRepository <SoftsHard, Long> {
    
}
