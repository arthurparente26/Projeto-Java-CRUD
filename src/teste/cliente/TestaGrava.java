package teste.cliente;

import modelo.Animal;
import modelo.Cliente;
import persistencia.ClienteDAO;

public class TestaGrava {
    public static void main(String[] args) throws Exception {
        
      Cliente cliente = new Cliente();
      cliente.setIngresso(1);
      cliente.setIdade(18);
      cliente.setNome("Bianca Soares");
      cliente.setCpf("021588569");
      
      Animal animal = new Animal();
      animal.setIdAnimal(5);
      
      cliente.setAnimal(animal);
      
        System.out.println(ClienteDAO.grava(cliente));
    }
    }