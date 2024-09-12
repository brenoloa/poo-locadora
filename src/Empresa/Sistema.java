package Empresa;

import Pessoas.Cliente;
import Pessoas.Funcionario;

public class Sistema {
    private Cliente cliente;
    private Frota carro;
    private Funcionario funcio;
    public Sistema(Cliente cliente, Frota carro, Funcionario funcio) {
        this.cliente = cliente;
        this.carro = carro;
        this.funcio = funcio;
    }
    
    public void pegarCarro(){
        if (this.carro.getDisponivel() == true){
            this.carro.setDisponivel(false);
            System.out.println("Cliente: " + this.cliente.getNome() + " Alugou o Carro: " + this.carro.getModelo());
            System.out.println("Validado pelo Funcionario: " + this.funcio.getNome());

        }
        else {
            System.out.println("Impossivel pegar carro, ta indisponivel!");
        }
    }

    public void devolverCarro(){
        if (this.carro.getDisponivel() == false) {
            this.carro.setDisponivel(true);
            System.out.println(this.carro.getModelo() + " DEVOLVIDO! por: " + this.cliente.getNome());
            System.out.println("Validado pelo Funcionario: " + this.funcio.getNome());
        }
        else {
            System.out.println("Veiculo ja foi devolvido! ");
        }
    }

    public void abastecer(int x){
        if (this.carro.getDisponivel() == true){
            System.out.println("== ABASTECENDO == ");
            this.carro.setCombustivel(carro.getCombustivel() + x);
        }
        else {
            System.out.println("Carro está em locação.");
        }
    }


    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Frota getCarro() {
        return carro;
    }
    public void setCarro(Frota carro) {
        this.carro = carro;
    }
    public Funcionario getFuncio() {
        return funcio;
    }
    public void setFuncio(Funcionario funcio) {
        this.funcio = funcio;
    }

    
    

}
