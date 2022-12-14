
package IServices;

import DTO.Persona;
import java.util.ArrayList;


public interface IPersonaService {
    public void Guardar(Persona per1);
    public void Modificar(int indice, Persona per1);
    public void Eliminar(Persona per1);
    public Persona Buscar (int indice);
    public ArrayList<Persona> ObtenerTodo();
   
    
}
