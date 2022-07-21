
package gastonServer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SoftsHard {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String trabajotitulo;
    private String comunicaciontitulo;
    private String creatividadtitulo;
    private String adaptaciontitulo;
    
    private String trabajodato;
    private String comunicaciondato;
    private String creatividaddato;
    private String adaptaciondato;

    public SoftsHard() {
    }

    public SoftsHard( Long id, String trabajotitulo, String comunicaciontitulo, String creatividadtitulo, String adaptaciontitulo, String trabajodato, String comunicaciondato, String creatividaddato, String adaptaciondato) {
        this.trabajotitulo = trabajotitulo;
        this.id = id;
        this.comunicaciontitulo = comunicaciontitulo;
        this.creatividadtitulo = creatividadtitulo;
        this.adaptaciontitulo = adaptaciontitulo;
        this.trabajodato = trabajodato;
        this.comunicaciondato = comunicaciondato;
        this.creatividaddato = creatividaddato;
        this.adaptaciondato = adaptaciondato;
    }

    public Long getId() {
        return id;
    }

    
    
    public String getTrabajotitulo() {
        return trabajotitulo;
    }

    public String getComunicaciontitulo() {
        return comunicaciontitulo;
    }

    public String getCreatividadtitulo() {
        return creatividadtitulo;
    }

    public String getAdaptaciontitulo() {
        return adaptaciontitulo;
    }

    public String getTrabajodato() {
        return trabajodato;
    }

    public String getComunicaciondato() {
        return comunicaciondato;
    }

    public String getCreatividaddato() {
        return creatividaddato;
    }

    public String getAdaptaciondato() {
        return adaptaciondato;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    
    public void setTrabajotitulo(String trabajotitulo) {
        this.trabajotitulo = trabajotitulo;
    }

    public void setComunicaciontitulo(String comunicaciontitulo) {
        this.comunicaciontitulo = comunicaciontitulo;
    }

    public void setCreatividadtitulo(String creatividadtitulo) {
        this.creatividadtitulo = creatividadtitulo;
    }

    public void setAdaptaciontitulo(String adaptaciontitulo) {
        this.adaptaciontitulo = adaptaciontitulo;
    }

    public void setTrabajodato(String trabajodato) {
        this.trabajodato = trabajodato;
    }

    public void setComunicaciondato(String comunicaciondato) {
        this.comunicaciondato = comunicaciondato;
    }

    public void setCreatividaddato(String creatividaddato) {
        this.creatividaddato = creatividaddato;
    }

    public void setAdaptaciondato(String adaptaciondato) {
        this.adaptaciondato = adaptaciondato;
    }
    
    
    
}
