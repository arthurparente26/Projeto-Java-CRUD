package modelo;
public class Cliente {
    
    private int idade;
    private int ingresso;
    private String nome;
    private String cpf;
    private Animal animal;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIngresso() {
        return ingresso;
    }

    public void setIngresso(int ingresso) {
        this.ingresso = ingresso;
    }
    
      public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
     public Cliente(){}
    
    public Cliente(int idade,int ingresso,String nome,String cpf,Animal animal){
        this.idade=idade;
        this.ingresso=ingresso;
        this.nome=nome;
        this.cpf=cpf;
        this.animal=animal;
    }
    
    public String toString(){
        return  "\n Nome:" + getNome()+
                "\n Cpf:" + getCpf()+
                "\n Idade:" + getIdade()+
                "\n Ingresso:" + getIngresso()+
                "\n Dados do Animal:" + getAnimal();
    }

  
}
