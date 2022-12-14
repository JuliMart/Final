/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package IServices;

import DTO.Producto;
import java.util.ArrayList;


public interface IProductoService {
    public void Guardar(Producto per1);
    public void Modificar(int indice, Producto pro1);
    public void Eliminar(Producto pro1);
    public Producto Buscar (int indice);
    public ArrayList<Producto> ObtenerTodo();
   
    
    
}
