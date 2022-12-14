
package IServices;

import DTO.Persona;
import java.util.ArrayList;


public class PersonaService implements IPersonaService {
    ArrayList<Persona> LisPer = new ArrayList();
    
    @Override
    public void Guardar(Persona per1){
    LisPer.add(per1);
    }
    
    @Override
    public void Modificar(int indice, Persona per1) {
    LisPer.set(indice, per1);
    }
    
    @Override
    public ArrayList<Persona> ObtenerTodo() {
        return LisPer;
    }
    
    @Override
    public Persona Buscar(int indice) {
        return LisPer.get(indice);
    }
    
    @Override
    public void Eliminar(Persona per1) {
        LisPer.remove(per1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<--- Lista de Personas --->");
        sb.append(" ").append(LisPer);
        sb.append(' ');
        return sb.toString();
    }    
    
}
