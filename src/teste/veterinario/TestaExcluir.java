package teste.veterinario;

import persistencia.VeterinarioDAO;

public class TestaExcluir {
    public static void main(String[] args)throws Exception {
        
         System.out.println(VeterinarioDAO.exclui(15));
    }
    
}
