
package DTO;


public abstract class Persona {
    String nombre;
    String fono;
    String rut;
    String correo; 

    public Persona(String nombre, String fono, String rut, String correo) {
        this.nombre = nombre;
        this.fono = fono;
        this.rut = rut;
        this.correo = correo;
    }
    public Persona() {
        this.nombre = "";
        this.fono = "";
        this.rut = "";
        this.correo = "";
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String toString(){
        return("\nNombre: "+nombre); 
        
    }
    }
  


