
package gastonServer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sobremi {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
   
    @Column(length=2000)  
  private String datos;

  

    public Sobremi() {
    }

    public Sobremi(Long id,String datos) {
        this.datos = datos;
        this.id =id;
    }
//Getter

    public Long getId() {
        return id;
    }
    
    public String getDatos() {
        return datos;
    }
    
//Setter
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }
  
  
    
}
