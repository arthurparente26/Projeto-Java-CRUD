package teste.veterinario;

import modelo.Animal;
import modelo.Veterinario;
import persistencia.VeterinarioDAO;

public class TestaGrava {
    public static void main(String[] args) throws Exception {
        
         Veterinario veterinario = new Veterinario();
      veterinario.setMatr(0303);
      veterinario.setSalario(4700.0);
      veterinario.setNome("Daniela");
      veterinario.setCpf("050505");
      
      Animal animal = new Animal();
      animal.setIdAnimal(5);
      
      veterinario.setAnimal(animal);
      
        System.out.println(VeterinarioDAO.grava(veterinario));
    }
    }