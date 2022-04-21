package modelo;
public class Animal {
    
    private Double peso;
    private String raca;
    private String genero;
    private int idAnimal;

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    
    public Animal(){}
    
    public Animal(Double peso,String raca,String genero,int idAnimal,Cliente cliente){
        this.peso=peso;
        this.genero=genero;
        this.raca=raca;
        this.idAnimal=idAnimal;
    }
    
    public String toString(){
        return
                "\n Peso:" + getPeso()+
                "\n Genero:" + getGenero()+
                "\n Raca:" + getRaca()+
                "\n Indeticador do Animal:" + getIdAnimal();
    }
}
