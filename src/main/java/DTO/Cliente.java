
package DTO;


public class Cliente extends Persona{
    private String ciudad;

    public Cliente(String ciudad, String nombre, String fono, String rut, String correo) {
        super(nombre, fono, rut, correo);
        this.ciudad = ciudad;
    }

    public Cliente(String ciudad) {
        super();
        this.ciudad = ciudad;
    }
    public Cliente() {
        super();
        this.ciudad = "";
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    @Override 
    public String toString(){
        return ("Nombre:"+nombre+
                "\nFono:"+fono+
                "\nCorreo: "+correo+
                "\nRUT: "+rut+
                "\nCiudad:"+ciudad);
    
    }
} 
