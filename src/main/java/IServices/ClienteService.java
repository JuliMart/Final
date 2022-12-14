
package IServices;

import DTO.Cliente;
import java.util.ArrayList;


public class ClienteService implements IClienteService {
    ArrayList<Cliente> LisCli = new ArrayList();
    
    @Override
    public void Guardar(Cliente cli1){
    LisCli.add(cli1);
    }
    
    @Override
    public void Modificar(int indice, Cliente cli1) {
    LisCli.set(indice, cli1);
    }
    
    @Override
    public ArrayList<Cliente> ObtenerTodo() {
        return LisCli;
    }
    
    @Override
    public Cliente Buscar(int indice) {
        return LisCli.get(indice);
    }
    
    @Override
    public void Eliminar(Cliente cli1) {
        LisCli.remove(cli1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<--- Lista de Clientes --->");
        sb.append(" ").append(LisCli);
        sb.append(' ');
        return sb.toString();
    }

    
    
}
