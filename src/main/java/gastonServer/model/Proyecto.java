
package gastonServer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String proyecto;
    private String proyecto1;
    private String proyecto2;
    private String proyecto3;
    private String proyecto4;
    private String proyecto5;
    private String proyecto6;

    public Proyecto() {
    }

    public Proyecto(Long id, String titulo, String proyecto, String proyecto1, String proyecto2, String proyecto3, String proyecto4, String proyecto5, String proyecto6) {
        this.titulo = titulo;
        this.id = id;
        this.proyecto = proyecto;
        this.proyecto1 = proyecto1;
        this.proyecto2 = proyecto2;
        this.proyecto3 = proyecto3;
        this.proyecto4 = proyecto4;
        this.proyecto5 = proyecto5;
        this.proyecto6 = proyecto6;
    }

    public Long getId() {
        return id;
    }

    
    
    public String getTitulo() {
        return titulo;
    }

    public String getProyecto() {
        return proyecto;
    }

    public String getProyecto1() {
        return proyecto1;
    }

    public String getProyecto2() {
        return proyecto2;
    }

    public String getProyecto3() {
        return proyecto3;
    }

    public String getProyecto4() {
        return proyecto4;
    }

    public String getProyecto5() {
        return proyecto5;
    }

    public String getProyecto6() {
        return proyecto6;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public void setProyecto1(String proyecto1) {
        this.proyecto1 = proyecto1;
    }

    public void setProyecto2(String proyecto2) {
        this.proyecto2 = proyecto2;
    }

    public void setProyecto3(String proyecto3) {
        this.proyecto3 = proyecto3;
    }

    public void setProyecto4(String proyecto4) {
        this.proyecto4 = proyecto4;
    }

    public void setProyecto5(String proyecto5) {
        this.proyecto5 = proyecto5;
    }

    public void setProyecto6(String proyecto6) {
        this.proyecto6 = proyecto6;
    }
   
    
    
}
