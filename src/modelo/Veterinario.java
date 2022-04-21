package modelo;
public class Veterinario extends Pessoa {

    private int matr;
    private Double salario;
    private Animal animal;

    public Veterinario(){}
    
    public Veterinario(String nome, String cpf,int matr,Double salario,Animal animal) {
        super(nome, cpf);
        this.matr=matr;
        this.salario=salario;
        this.animal=animal;
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    
    
   public String toString(){
       return "\n Dados do Veterinario"+
               "\n Nome:" + getNome()+
               "\n Cpf:" + getCpf()+
               "\n Matricula:"+getMatr()+
               "\n Salario:" + getSalario()+
               "\n Dados do Animal" + getAnimal();
   }
    
}
