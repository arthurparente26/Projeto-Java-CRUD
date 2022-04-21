package teste.cliente;

import modelo.Cliente;
import persistencia.ClienteDAO;

public class TestaAltera {
   
    public static void main(String[] args)throws Exception {
        
   Cliente cliente = new Cliente();
   
        cliente.setIdade(20);
        
        cliente.setIngresso(3);
        
        System.out.println(ClienteDAO.altera(cliente));
    }
    }
