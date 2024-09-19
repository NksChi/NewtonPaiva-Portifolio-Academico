import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        int soma = num1 + num2;

        JOptionPane.showMessageDialog(null,
                "A soma dos números é: " + soma, "Resultado da soma", JOptionPane.WARNING_MESSAGE);

    }
}
