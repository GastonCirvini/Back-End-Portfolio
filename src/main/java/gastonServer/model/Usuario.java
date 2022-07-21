
package gastonServer.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;


@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nombre;
     @NotNull
     @Column (unique = true)
    private String nombreUsuario;
      @NotNull
    private String email;
      @NotNull
    private String password;
      
     @NotNull
      @ManyToMany (fetch = FetchType.EAGER)
      @JoinTable (name ="usuario_rol", joinColumns = @JoinColumn(name="usuario_id"), inverseJoinColumns = @JoinColumn (name ="rol_id") )
    private Set<Rol> roles = new HashSet<>();

    public Usuario() {
    }

    public Usuario( String nombre, String nombreUsuario, String email, String password) {

        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreusuario() {
        return nombreUsuario;
    }

    public void setNombreusuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return password;
    }

    public void setContrasenia(String password) {
        this.password = password;
    }

    public Set<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }
    
    
}
