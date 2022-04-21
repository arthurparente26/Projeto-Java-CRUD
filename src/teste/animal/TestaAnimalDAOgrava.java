package teste.animal;

import modelo.Animal;
import persistencia.AnimalDAO;

public class TestaAnimalDAOgrava {
    public static void main(String[] args)throws Exception {
        
        Animal animal = new Animal();
        animal.setIdAnimal(15);
        animal.setPeso(20.0);
        animal.setGenero("macho");
        animal.setRaca("Leão");
        
        System.out.println(AnimalDAO.grava(animal));
    }
    
}
