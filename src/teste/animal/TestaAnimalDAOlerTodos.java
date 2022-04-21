package teste.animal;

import persistencia.AnimalDAO;

public class TestaAnimalDAOlerTodos {
    public static void main(String[] args) throws Exception{
        
        System.out.println(AnimalDAO.leTodos());
    }
    
}