
package IServices;

import DTO.Vendedor;
import java.util.ArrayList;


public interface IVendedorService {
    public void Guardar(Vendedor ven1);
    public void Modificar(int indice, Vendedor ven1);
    public void Eliminar(Vendedor ven1);
    public Vendedor Buscar (int indice);
    public ArrayList<Vendedor> ObtenerTodo();
   
}
