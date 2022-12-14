
package DTO;


public class Vendedor extends Persona {
    private String direccion;

    public Vendedor(String direccion) {
        super();
        this.direccion = direccion;
    }

    public Vendedor() {
        super();
        this.direccion = "";
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString(){
        return(nombre+direccion+fono+correo+rut);
    }
}    

