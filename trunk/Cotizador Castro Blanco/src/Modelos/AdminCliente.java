
package Modelos;

import DAO.ClienteDAO;
import Entidades.Cliente;


public class AdminCliente
{
    private ClienteDAO clienteDAO ;

    public AdminCliente (){
        this.clienteDAO = new ClienteDAO () ;
    }

    public Cliente obtenerPorNombreCliente (String tipoId , int numeroId){
        Cliente c = this.clienteDAO.obtenerPorTipoNumeroDni(tipoId, numeroId);
        return c ;
    }
}
