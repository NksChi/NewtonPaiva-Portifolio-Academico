package br.com.banco.newton;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Banco: \n 1- Conta Corrente \n 2- Conta Poupança \n 3- Sair"));
        int num;
        double saldo, limite, rendimento, atual = 0;

        switch (opcao){
            case(1):
                num = Integer.parseInt(JOptionPane.showInputDialog("Número da conta: "));
                saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo: "));
                limite = Double.parseDouble(JOptionPane.showInputDialog("Limite: "));
                ContaCorrente cc1 = new ContaCorrente(num,saldo,limite);
                JOptionPane.showMessageDialog(null,"saldo:" + cc1.getSaldo() + "\n" + "saldo com limite:" + cc1.getLimite() + "\n","Conta Corrente", JOptionPane.INFORMATION_MESSAGE);
                break;

            case (2):
                num = Integer.parseInt(JOptionPane.showInputDialog("Número da conta: "));
                saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo: "));
                rendimento = Double.parseDouble(JOptionPane.showInputDialog("Rendimento: "));
                ContaPoupanca cp1 = new ContaPoupanca(num,saldo,rendimento);
                cp1.AtualizaRendimento();
                JOptionPane.showMessageDialog(null,"saldo:" + cp1.getSaldo(),"Conta Poupança", JOptionPane.INFORMATION_MESSAGE);
                break;

            case (3):
                JOptionPane.showMessageDialog(null,"Agradeço a preferencia!", "Concluido",JOptionPane.INFORMATION_MESSAGE);
                break;

            default:
                JOptionPane.showMessageDialog(null,"Opção Inválida!", "Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
}
