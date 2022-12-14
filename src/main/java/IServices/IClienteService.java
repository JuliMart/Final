
package IServices;

import DTO.Cliente;
import java.util.ArrayList;


public interface IClienteService {
    public void Guardar(Cliente cli1);
    public void Modificar(int indice, Cliente cli1);
    public void Eliminar(Cliente cli1);
    public Cliente Buscar (int indice);
    public ArrayList<Cliente> ObtenerTodo();
    
}
