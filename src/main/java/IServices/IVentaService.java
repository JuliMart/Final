
package IServices;

import DTO.Venta;
import java.util.ArrayList;


public interface IVentaService {
    public interface IVendedorService {
    public void Guardar(Venta venta1);
    public void Modificar(int indice, Venta venta1);
    public void Eliminar(Venta venta1);
    public Venta Buscar (int indice);
    public ArrayList<Venta> ObtenerTodo();
    }
}
