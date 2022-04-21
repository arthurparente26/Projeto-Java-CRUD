package modelo;

import org.apache.commons.lang.StringUtils;

public class Funcionario extends Pessoa {
    
    private String endereco;
    private int cargaHoraria;
    private int carteiraTrabalho;
    private Cliente cliente;
    
 
    
    public Funcionario(String nome, String cpf,String endereco,int cargaHoraria,int carteiraTrabalho,Cliente cliente) {
        super(nome, cpf);
        this.endereco=endereco;
        this.cargaHoraria=cargaHoraria;
        this.carteiraTrabalho=carteiraTrabalho;
        this.cliente=cliente;
    }

     public Funcionario(){}
     
     public String formatarCPF() {

String cpfCompleto = StringUtils.leftPad(getCpf(),11,'0');

return cpfCompleto.substring(0,3) + "." + cpfCompleto.substring(3,6) + "." + cpfCompleto.substring(6,9) + "-" + cpfCompleto.substring(9,11);}
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    public void setCarteiraTrabalho(int carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public String toString(){
        return "\n Dados do Funcionario"+
                "\n Nome:" + getNome()+
                "\n Cpf:" + formatarCPF()+
                "\n Endereco:" + getEndereco()+
                "\n Carga Horaria:" + getCargaHoraria()+
                "\n Numero Carteira de Trabalho:"+getCarteiraTrabalho()+
                "\n Dados do Cliente:" + getCliente();
    }
}
