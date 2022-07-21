
package gastonServer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Titulos {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
   private String titulo;
   private String titulo1;
   private String titulo2;
   private String titulo3;
   private String titulo4;

    public Titulos(String titulo4) {
        this.titulo4 = titulo4;
    }

    public String getTitulo4() {
        return titulo4;
    }

    public void setTitulo4(String titulo4) {
        this.titulo4 = titulo4;
    }

   
//Constructors
    public Titulos() {
    } 
    public Titulos(Long id,String titulo, String titulo1, String titulo2, String titulo3) {
        this.titulo = titulo;
        this.id = id;
        this.titulo1 = titulo1;
        this.titulo2 = titulo2;
        this.titulo3 = titulo3;
      
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

    public String getTitulo2() {
        return titulo2;
    }

    public String getTitulo3() {
        return titulo3;
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

    public void setTitulo2(String titulo2) {
        this.titulo2 = titulo2;
    }

    public void setTitulo3(String titulo3) {
        this.titulo3 = titulo3;
    }
   

   
}
