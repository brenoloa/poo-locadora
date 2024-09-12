package Pessoas;

public class Funcionario extends Pessoa{
    private int codigo;
    private double salario;
    public Funcionario(String nome, int idade, int codigo, double salario) {
        super(nome, idade);
        this.codigo = codigo;
        this.salario = salario;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public String toString() {
        return this.getNome();
    }

    
}
