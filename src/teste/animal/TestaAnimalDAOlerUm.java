package teste.animal;

import persistencia.AnimalDAO;

public class TestaAnimalDAOlerUm {
    public static void main(String[] args) throws Exception {
        
         System.out.println(AnimalDAO.leUm(10));
    }
    
}
