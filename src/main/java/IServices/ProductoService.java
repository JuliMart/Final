/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IServices;

import DTO.Producto;
import java.util.ArrayList;


public class ProductoService implements IProductoService{
    ArrayList<Producto> LisPro = new ArrayList();
    
    @Override
    public void Guardar(Producto pro1){
    LisPro.add(pro1);
    }
    
    @Override
    public void Modificar(int indice, Producto pro1) {
    LisPro.set(indice, pro1);
    }
    
    @Override
    public ArrayList<Producto> ObtenerTodo() {
        return LisPro;
    }
    
    @Override
    public Producto Buscar(int indice) {
        return LisPro.get(indice);
    }
    
    @Override
    public void Eliminar(Producto pro1) {
        LisPro.remove(pro1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<--- Lista de Productos --->");
        sb.append(" ").append(LisPro);
        sb.append(' ');
        return sb.toString();
    }    
        
}
