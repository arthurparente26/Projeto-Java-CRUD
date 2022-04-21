package teste.veterinario;

import persistencia.VeterinarioDAO;

public class TestaLerTodos {
    public static void main(String[] args)throws Exception {
        
         System.out.println(VeterinarioDAO.leTodos());
        
    }
    
}