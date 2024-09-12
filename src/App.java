import Empresa.Frota;
import Empresa.Sistema;
import Pessoas.Cliente;
import Pessoas.Funcionario;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente("Breno", 20, "123.123.123-54");
        Funcionario f1 = new Funcionario("Jose", 44, 001, 1500);

        Frota carro = new Frota("Hyundai", "HB20", "ABC-1234", 2020, 15674);

        Sistema breliza = new Sistema(c1, carro, f1);

        breliza.pegarCarro();
        breliza.devolverCarro();
        carro.status();

        breliza.abastecer(50);
       
        carro.status();
    }
}
