
package gastonServer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EducacionyExperiencia {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String titulo1;
    @Column(length=2000)  
    private String datos;
    @Column(length=2000)  
    private String datos1;

    
    
    //Constructor
    public EducacionyExperiencia() {
    }

    
    
    public EducacionyExperiencia(Long id, String titulo, String titulo1, String datos, String datos1) {
        this.id = id;
        this.titulo = titulo;
        this.titulo1 = titulo1;
        this.datos = datos;
        this.datos1 = datos1;
    }
//Getters

    public Long getId() {
        return id;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getTitulo1() {
        return titulo1;
    }

    public String getDatos() {
        return datos;
    }

    public String getDatos1() {
        return datos1;
    }
//Setters

    public void setId(Long id) {
        this.id = id;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTitulo1(String titulo1) {
        this.titulo1 = titulo1;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public void setDatos1(String datos1) {
        this.datos1 = datos1;
    }
    
    
    
    
    
}
