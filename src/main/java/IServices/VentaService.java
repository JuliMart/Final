/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IServices;

import DTO.Venta;
import java.util.ArrayList;


public class VentaService implements IVentaService {
        ArrayList<Venta> LisVen = new ArrayList();
    
    public void Guardar(Venta venta1){
    LisVen.add(venta1);
    }
    
    public void Modificar(int indice, Venta venta1) {
    LisVen.set(indice, venta1);
    }
    
    public ArrayList<Venta> ObtenerTodo() {
        return LisVen;
    }
    
    public Venta Buscar(int indice) {
        return LisVen.get(indice);
    }
    
    public void Eliminar(Venta venta1) {
        LisVen.remove(venta1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<--- Lista de Ventas--->");
        sb.append(" ").append(LisVen);
        sb.append(' ');
        return sb.toString();
    }    
    
    
}
