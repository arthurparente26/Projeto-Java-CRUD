package teste.cliente;

import persistencia.ClienteDAO;

public class TestaExcluir {
    public static void main(String[] args)throws Exception {
        
        System.out.println(ClienteDAO.exclui(1));
    }
    
}