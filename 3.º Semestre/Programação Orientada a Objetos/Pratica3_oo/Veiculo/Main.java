package br.com.veiculo.newton;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, """
                Escolha uma opção:
                1 - Veículo
                2 - Ônibus
                3 - Caminhão"""));

        switch (opcao) {
            case 1:
                String placa = JOptionPane.showInputDialog(null, "Informe a placa do veículo:");
                int ano = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Informe o ano do veículo:"));

                Veiculo veiculo = new Veiculo(placa, ano);
                JOptionPane.showMessageDialog(null,
                        "Dados do veículo:\n\n" + veiculo.exibirDados());
                break;

            case 2:
                placa = JOptionPane.showInputDialog(null, "Informe a placa do ônibus:");
                ano = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Informe o ano do ônibus:"));
                int assentos = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Informe o número de assentos do ônibus:"));

                Onibus onibus = new Onibus(placa, ano, assentos);
                JOptionPane.showMessageDialog(null,
                        "Dados do ônibus:\n\n" + onibus.exibirDados());
                break;

            case 3:
                placa = JOptionPane.showInputDialog(null, "Informe a placa do caminhão:");
                ano = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Informe o ano do caminhão:"));
                int eixos = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Informe o número de eixos do caminhão:"));

                Caminhao caminhao = new Caminhao(placa, ano, eixos);
                JOptionPane.showMessageDialog(null,
                        "Dados do caminhão:\n\n" + caminhao.exibirDados());
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                break;
        }
    }
}
