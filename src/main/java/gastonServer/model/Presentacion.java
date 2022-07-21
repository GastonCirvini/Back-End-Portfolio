
package gastonServer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Presentacion {
   @Id
   @GeneratedValue (strategy = GenerationType.AUTO)
 private Long Id;
 private String nombreytitulo;
 private String nacimiento;
 private String residencia;
 private String edad;
 private String estudios;
 private String estudios2;
 private String estudios3;
 private String estudios4;
 private String email;

 //Constructor
    public Presentacion() {
    }

    public Presentacion(Long Id, String estudios4, String nombreytitulo, String estudios2, String estudios3, String nacimiento, String edad, String estudios, String email, String residencia) {
        this.Id = Id;
        this.estudios2 = estudios2;
        this. estudios3 = estudios3;
        this.estudios4 = estudios4;
        this.nombreytitulo = nombreytitulo;
        this.nacimiento = nacimiento;
        this.edad = edad;
        this.estudios = estudios;
        this.email = email;
        this.residencia = residencia;
    }
//Getter

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    
    public String getEstudios2() {
        return estudios2;
    }

    public String getEstudios3() {
        return estudios3;
    }
    public String getEstudios4() {
        return estudios4;
    }
    
    public Long getId() {
        return Id;
    }

    public String getNombreytitulo() {
        return nombreytitulo;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public String getEdad() {
        return edad;
    }

    public String getEstudios() {
        return estudios;
    }

    public String getEmail() {
        return email;
    }
//Setter

    public void setEstudios2(String estudios2) {
        this.estudios2 = estudios2;
    }

    public void setEstudios3(String estudios3) {
        this.estudios3 = estudios3;
    }
    
    public void setEstudios4(String estudios4) {
        this.estudios4 = estudios4;
    }
    
    
    public void setId(Long Id) {
        this.Id = Id;
    }

    public void setNombreytitulo(String nombreytitulo) {
        this.nombreytitulo = nombreytitulo;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 
 
    
    
    
}
