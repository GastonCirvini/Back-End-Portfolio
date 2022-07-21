
package gastonServer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HardSkills {
    
     @Id
   @GeneratedValue (strategy = GenerationType.AUTO)
   private Long id;
    private int javaScript;
     private int angular;
   private  int html;
   private int css;
    private int bootstrap;
   private int java;
   private int springboot;
   private int mysql;

    public HardSkills() {
    }

    public HardSkills(Long id, int javaScript, int angular, int html, int css, int bootstrap, int java, int springboot, int mysql) {
        this.id = id;
        this.javaScript = javaScript;
        this.angular = angular;
        this.html = html;
        this.css = css;
        this.bootstrap = bootstrap;
        this.java = java;
        this.springboot = springboot;
        this.mysql = mysql;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getJavaScript() {
        return javaScript;
    }

    public void setJavaScript(int javaScript) {
        this.javaScript = javaScript;
    }

    public int getAngular() {
        return angular;
    }

    public void setAngular(int angular) {
        this.angular = angular;
    }

    public int getHtml() {
        return html;
    }

    public void setHtml(int html) {
        this.html = html;
    }

    public int getCss() {
        return css;
    }

    public void setCss(int css) {
        this.css = css;
    }

    public int getBootstrap() {
        return bootstrap;
    }

    public void setBootstrap(int bootstrap) {
        this.bootstrap = bootstrap;
    }

    public int getJava() {
        return java;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public int getSpringboot() {
        return springboot;
    }

    public void setSpringboot(int springboot) {
        this.springboot = springboot;
    }

    public int getMysql() {
        return mysql;
    }

    public void setMysql(int mysql) {
        this.mysql = mysql;
    }
    
    
    
    
}
