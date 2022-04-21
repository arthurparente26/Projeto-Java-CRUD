package teste.funcionario;

import persistencia.FuncionarioDAO;

public class TestaExcluir {
    public static void main(String[] args)throws Exception {
        
        System.out.println(FuncionarioDAO.exclui(2));
    }
    
}