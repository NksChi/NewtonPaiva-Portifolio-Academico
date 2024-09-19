package br.com.projetosocial.newton;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                    Escolha a opção desejada:
                    <1> Cadastrar Projeto Distribuir Alimentos
                    <2> Cadastrar Projeto Trabalho Voluntário
                    <3> Sair"""));

            switch (opcao) {
                case 1 -> {
                    DistribuicaoAlimento distAlimento = new DistribuicaoAlimento(
                            JOptionPane.showInputDialog("Digite o nome do projeto:"),
                            JOptionPane.showInputDialog("Digite a descrição do projeto:"),
                            JOptionPane.showInputDialog("Digite o endereço do projeto:"),
                            JOptionPane.showInputDialog("Digite a data de início do projeto (dd/mm/aaaa):"),
                            JOptionPane.showInputDialog("Digite a data de fim do projeto (dd/mm/aaaa):"),
                            JOptionPane.showInputDialog("Digite a descrição do alimento:"),
                            Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de alimentos:"))
                    );
                    if (distAlimento.validaProjeto()) {
                        JOptionPane.showMessageDialog(null, "Projeto cadastrado com sucesso!");
                        JOptionPane.showMessageDialog(null, distAlimento.imprimeProjeto());
                    } else {
                        JOptionPane.showMessageDialog(null, "Data de fim do projeto não preenchida.");
                    }
                }

                case 2 -> {
                    TrabalhoVoluntario trabVoluntario = new TrabalhoVoluntario(
                            JOptionPane.showInputDialog("Digite o nome do projeto:"),
                            JOptionPane.showInputDialog("Digite a descrição do projeto:"),
                            JOptionPane.showInputDialog("Digite o endereço do projeto:"),
                            JOptionPane.showInputDialog("Digite a data de início do projeto (dd/mm/aaaa):"),
                            JOptionPane.showInputDialog("Digite a data de fim do projeto (dd/mm/aaaa):"),
                            JOptionPane.showInputDialog("Digite o tipo de trabalho:"),
                            Integer.parseInt(JOptionPane.showInputDialog("Digite a duração do trabalho (em horas):"))
                    );
                    if (trabVoluntario.validaProjeto()) {
                        JOptionPane.showMessageDialog(null, "Projeto cadastrado com sucesso!");
                        JOptionPane.showMessageDialog(null, trabVoluntario.imprimeProjeto());
                    } else {
                        JOptionPane.showMessageDialog(null, "A duração do trabalho deve ser superior a 2 horas.");
                    }
                }

                case 3 -> JOptionPane.showMessageDialog(null, "Encerrando o programa...");
                default -> JOptionPane.showMessageDialog(null, "Opção inválida. Digite novamente.");
            }

        } while (opcao != 3);
    }
}