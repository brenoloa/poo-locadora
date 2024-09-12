package Empresa;

public class Frota {
    private String marca;
    private String modelo;
    private String placa;
    private int ano;
    private double km;
    private int combustivel;
    private boolean disponivel;
    public Frota(String marca, String modelo, String placa, int ano, double km) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.km = km;
        this.combustivel = 50;
        this.disponivel = true;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public double getKm() {
        return km;
    }
    public void setKm(double km) {
        this.km = km;
    }
    public int getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }
    public boolean getDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void status(){
        if (this.disponivel == true){
            System.out.println("=== DISPONIVEIS ===");
            System.out.println("Carro: " + this.getModelo() + "  " + this.getMarca());
            System.out.println("Ano: " + this.getAno() + " " + this.getKm() + "km");
            System.out.println("Placa: " + this.getPlaca());
            System.out.println("Tanque de Gasolina : " + this.getCombustivel() + " litros.");
        }
        else {
            System.out.println("CARRO INDISPONIVEL. ");
        }
    }

    @Override
    public String toString() {
        return this.getModelo();
    }

    


}

