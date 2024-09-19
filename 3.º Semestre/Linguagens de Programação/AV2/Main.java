package Horta;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente:");
        Cliente c1 = new Cliente(nomeCliente);
        Pedido p1 = new Pedido(c1);

        while (true) {
            String fruta = JOptionPane.showInputDialog("Escolha uma fruta:\n" +
                    "1.Banana\n" +
                    "2.Laranja\n" +
                    "3.Goiaba\n" +
                    "4.Sair");

            if (fruta.equalsIgnoreCase("sair")) {
                break;
            }
            switch (fruta.toLowerCase()) {
                case "banana":
                    p1.addFruta(new Fruta("Banana", 2.50));
                    break;
                case "laranja":
                    p1.addFruta(new Fruta("Laranja", 3.00));
                    break;
                case "goiaba":
                    p1.addFruta(new Fruta("Goiaba", 1.80));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Fruta inválida!",
                            "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        String resumo = "Dados do Pedido";
        resumo += "\n\nCliente: " + p1.getCliente().getNome();
        resumo += "\nLista de Frutas: " + p1.getFrutas();
        resumo += "\nValor do Pedido: R$ " + String.format("%.2f", p1.getValorTotal());

        JOptionPane.showMessageDialog(null, resumo, "Resumo do Pedido",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
