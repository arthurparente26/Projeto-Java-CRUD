package teste.cliente;

import persistencia.ClienteDAO;

public class TestaLerTodos {
    public static void main(String[] args)throws Exception {
        
         System.out.println(ClienteDAO.leTodos());
        
    }
    
}
