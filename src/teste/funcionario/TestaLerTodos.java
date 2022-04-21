package teste.funcionario;

import persistencia.FuncionarioDAO;

public class TestaLerTodos {
    public static void main(String[] args)throws Exception {
        
         System.out.println(FuncionarioDAO.leTodos());
        
    }
    
}