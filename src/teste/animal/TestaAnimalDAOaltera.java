package teste.animal;

import persistencia.AnimalDAO;

public class TestaAnimalDAOaltera {
    public static void main(String[] args)throws Exception {
        
        System.out.println(AnimalDAO.altera(10.7,"Macaco","Femea",10));
    }
    
}
