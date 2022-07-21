
package gastonServer.service;
import gastonServer.model.Usuario;
import gastonServer.repository.UsuarioRepository;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Optional <Usuario> getByNombreUsuario(String nombreUsuario) {
       return usuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario (String nombreUsuario) {
        return usuarioRepository.existsByNombreUsuario(nombreUsuario);
    }

      public boolean existsByEmail (String email) {
        return usuarioRepository.existsByNombreUsuario(email);
    }

      public void save (Usuario usuario) {
          usuarioRepository.save(usuario);
      }
}
