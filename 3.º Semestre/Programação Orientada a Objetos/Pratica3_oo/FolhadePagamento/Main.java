package br.com.pagamento.newton;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nome, matricula;
        double salarioFixo, valorVendas, valorProducao;
        int opcao;

        JOptionPane.showMessageDialog(null, "=== Cadastro de Funcionários ===");

        nome = JOptionPane.showInputDialog("Digite o nome do funcionário:");
        matricula = JOptionPane.showInputDialog("Digite a matrícula do funcionário:");
        salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário fixo do funcionário:"));

        opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                Escolha o tipo de funcionário:
                1 - Padrão
                2 - Comissionado
                3 - Produtividade"""));

        switch (opcao) {
            case 1 -> {
                FPadrao fPadrao = new FPadrao(nome, matricula, salarioFixo);
                JOptionPane.showMessageDialog(null, "Funcionário Padrao: " + nome + "\n" +
                        "Matrícula: " + matricula + "\nSalário: R$ " + salarioFixo +
                        "\nProventos: R$ " + fPadrao.calcularProventos());
            }

            case 2 -> {
                valorVendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total de vendas do funcionário:"));
                double comissao = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de comissão do funcionário (em decimal):"));
                FComissionado fComissionado = new FComissionado(nome, matricula, salarioFixo, valorVendas, comissao);
                JOptionPane.showMessageDialog(null, "Funcionário Comissionado: " + nome + "\n" +
                        "Matrícula: " + matricula + "\n" +
                        "Salário: R$ " + salarioFixo  + "\nSalário Atualizado: R$ "
                        + fComissionado.calcularProventos());
            }

            case 3 -> {
                double valorPorUnidadeProd = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por unidade produzida:"));
                int quantidadeProd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade produzida pelo funcionário:"));
                FProdutividade produtivo = new FProdutividade(nome, matricula, salarioFixo, valorPorUnidadeProd, quantidadeProd);
                JOptionPane.showMessageDialog(null, produtivo.toString() +
                        "Salário Atualizado: R$" + produtivo.calcularProventos());
            }


            default -> JOptionPane.showMessageDialog(null, "Opção inválida!");
        }
    }
}

