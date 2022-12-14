/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IServices;

import DTO.Vendedor;
import java.util.ArrayList;

/**
 *
 * @author julia
 */
public class VendedorService implements IVendedorService{
    ArrayList<Vendedor> LisVen = new ArrayList();
    
    @Override
    public void Guardar(Vendedor ven1){
    LisVen.add(ven1);
    }
    
    @Override
    public void Modificar(int indice, Vendedor ven1) {
    LisVen.set(indice, ven1);
    }
    
    @Override
    public ArrayList<Vendedor> ObtenerTodo() {
        return LisVen;
    }
    
    @Override
    public Vendedor Buscar(int indice) {
        return LisVen.get(indice);
    }
    
    @Override
    public void Eliminar(Vendedor ven1) {
        LisVen.remove(ven1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<--- Lista de Vendedores --->");
        sb.append(" ").append(LisVen);
        sb.append(' ');
        return sb.toString();
    }    
    
    
}
