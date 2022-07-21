
package gastonServer.repository;

import gastonServer.model.Rol;
import gastonServer.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RolRepository extends JpaRepository <Rol, Integer> {

    Optional <Rol> findByRolNombre (RolNombre rolNombre);


}
