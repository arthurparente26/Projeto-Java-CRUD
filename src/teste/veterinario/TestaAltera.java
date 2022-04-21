package teste.veterinario;

import modelo.Veterinario;
import persistencia.VeterinarioDAO;

public class TestaAltera {
    public static void main(String[] args) throws Exception{
        
          Veterinario veterinario = new Veterinario();
   
        veterinario.setSalario(3500.0);
        
        veterinario.setMatr(15);
        
        System.out.println(VeterinarioDAO.altera(veterinario));
        
    }
    
}
