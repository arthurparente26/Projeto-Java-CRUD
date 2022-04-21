package teste.cliente;

import persistencia.ClienteDAO;

public class TestaLerUm {
    public static void main(String[] args) throws Exception {
        
        System.out.println(ClienteDAO.leUm(1));
    }
    
}
