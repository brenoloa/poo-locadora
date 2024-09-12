import Empresa.Frota;
import Empresa.Sistema;
import Pessoas.Cliente;
import Pessoas.Funcionario;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class App {
    public static void main(String[] args) {
        
        Cliente[] clientes = {
            new Cliente("Julio Pereira", 20, "123.123.123-54"),
            new Cliente("Ana Carolina", 25, "234.234.234-65"),
            new Cliente("Carlos Miguel", 30, "345.345.345-76"),
            new Cliente("Diana Jungle", 35, "456.456.456-87")
        };

        Funcionario[] funcionarios = {
            new Funcionario("Jose Alvaro", 44, 001, 1500),
            new Funcionario("Maria Amora", 35, 002, 1600),
            new Funcionario("Pedro Scooby", 40, 003, 1700),
            new Funcionario("Luana Piovani", 28, 004, 1800)
        };

        Frota[] carros = {
            new Frota("Hyundai", "HB20", "ABC-1234", 2020, 15674),
            new Frota("Ford", "Fiesta", "XYZ-5678", 2019, 23456),
            new Frota("Chevrolet", "Onix", "LMN-9012", 2021, 34567),
            new Frota("Volkswagen", "Gol", "QRS-3456", 2018, 45678)
        };

        Sistema[] sistemas = new Sistema[carros.length];
        for (int i = 0; i < carros.length; i++) {
            sistemas[i] = new Sistema(clientes[i % clientes.length], carros[i], funcionarios[i % funcionarios.length]);
        }

        
        JFrame frame = new JFrame("Sistema de Locadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

       //display
        JTextArea display = new JTextArea();
        display.setEditable(false);
        JScrollPane scroll = new JScrollPane(display);
        frame.add(scroll, BorderLayout.CENTER);

        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1));

        // selecionar cliente
        JComboBox<Cliente> comboCliente = new JComboBox<>(clientes);
        panel.add(new JLabel("Selecionar Cliente:"));
        panel.add(comboCliente);

        // selecionar funcio
        JComboBox<Funcionario> comboFuncionario = new JComboBox<>(funcionarios);
        panel.add(new JLabel("Selecionar Funcionário:"));
        panel.add(comboFuncionario);

        //selecionar carro
        JComboBox<Frota> comboCarro = new JComboBox<>(carros);
        panel.add(new JLabel("Selecionar Veículo:"));
        panel.add(comboCarro);

        // Botão para pegar carro
        JButton btnPegarCarro = new JButton("Pegar Carro");
        btnPegarCarro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Frota carroSelecionado = (Frota) comboCarro.getSelectedItem();
                Cliente clienteSelecionado = (Cliente) comboCliente.getSelectedItem();
                Funcionario funcionarioSelecionado = (Funcionario) comboFuncionario.getSelectedItem();
                Sistema sistema = new Sistema(clienteSelecionado, carroSelecionado, funcionarioSelecionado);
                sistema.pegarCarro();
                display.append("PegarCarro() " + carroSelecionado.getModelo() + "\n");
            }
        });
        panel.add(btnPegarCarro);

        // Botão para devolver carro
        JButton btnDevolverCarro = new JButton("Devolver Carro");
        btnDevolverCarro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Frota carroSelecionado = (Frota) comboCarro.getSelectedItem();
                Cliente clienteSelecionado = (Cliente) comboCliente.getSelectedItem();
                Funcionario funcionarioSelecionado = (Funcionario) comboFuncionario.getSelectedItem();
                Sistema sistema = new Sistema(clienteSelecionado, carroSelecionado, funcionarioSelecionado);
                sistema.devolverCarro();
                display.append("DevolverCarro() " + carroSelecionado.getModelo() + "\n");
            }
        });
        panel.add(btnDevolverCarro);

        // Botão para abastecer carro
        JButton btnAbastecer = new JButton("Abastecer Carro");
        btnAbastecer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Frota carroSelecionado = (Frota) comboCarro.getSelectedItem();
                Cliente clienteSelecionado = (Cliente) comboCliente.getSelectedItem();
                Funcionario funcionarioSelecionado = (Funcionario) comboFuncionario.getSelectedItem();
                Sistema sistema = new Sistema(clienteSelecionado, carroSelecionado, funcionarioSelecionado);
                sistema.abastecer(50); // Aqui você pode ajustar o valor conforme necessário
                display.append("Abastercer() \n");
            }
        });
        panel.add(btnAbastecer);

        // Adicionando o painel de seleção e botões ao frame
        frame.add(panel, BorderLayout.SOUTH);

        // Exibindo a janela
        frame.setVisible(true);
    }
}
