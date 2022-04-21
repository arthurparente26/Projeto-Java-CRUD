package teste.funcionario;

import modelo.Cliente;
import modelo.Funcionario;
import persistencia.FuncionarioDAO;

public class TestaGrava {
    public static void main(String[] args) throws Exception {
        
         Funcionario funcionario = new Funcionario();
      funcionario.setCarteiraTrabalho(2);
      funcionario.setEndereco("Quadra 34 LOTE 18");
      funcionario.setCargaHoraria(10);
      funcionario.setNome("Arthur");
      funcionario.setCpf("579631");
      
      Cliente cliente = new Cliente();
      cliente.setIngresso(3);
      
      funcionario.setCliente(cliente);
      
        System.out.println(FuncionarioDAO.grava(funcionario));
    }
    }
