package teste.funcionario;

import modelo.Funcionario;
import persistencia.FuncionarioDAO;

public class TestaAtera {
   
    public static void main(String[] args)throws Exception {
        
   Funcionario funcionario = new Funcionario();
   
        funcionario.setEndereco("QE 60 Apt 02");
        
        funcionario.setCarteiraTrabalho(15);
        
        System.out.println(FuncionarioDAO.altera(funcionario));
    }
    }