package teste.funcionario;

import persistencia.FuncionarioDAO;

public class TestaLerUm {
    public static void main(String[] args) throws Exception {
        
        System.out.println(FuncionarioDAO.leUm(155));
    }
    
}
