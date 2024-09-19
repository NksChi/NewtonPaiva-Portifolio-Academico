import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nomeCliente = JOptionPane.showInputDialog("Informe o nome do cliente:");
        Cliente cliente = new Cliente(nomeCliente);

        String nomeMassa = JOptionPane.showInputDialog("Informe o nome da massa:");
        double valorMassa = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da massa:"));
        Massa massa = new Massa(nomeMassa, valorMassa);

        String[] opcoesIngredientes = {"Bacon", "Mussarela", "Tomate", "Queijo"};
        ArrayList<Ingrediente> ingredientesEscolhidos = new ArrayList<Ingrediente>();
        double valorIngredientes = 0;

        while (true) {
            int escolha = JOptionPane.showOptionDialog(null, "Escolha os ingredientes:", "Cantina",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesIngredientes, opcoesIngredientes[0]);

            if (escolha == opcoesIngredientes.length) {
                break;
            }

            Ingrediente ingrediente = new Ingrediente(opcoesIngredientes[escolha]);
            ingredientesEscolhidos.add(ingrediente);
            valorIngredientes += 2.0;
        }

        ArrayList<Ingrediente> ingredientes = ingredientesEscolhidos;
        Pedido pedido = new Pedido(massa, cliente, ingredientes);

        double valorTotal = pedido.calcularValor();

        String mensagem = "Pedido feito para " + pedido.getCliente().getNome() + "\n" + pedido.getMassa().getTipo() + " com ";
        for (Ingrediente ingrediente : pedido.getIngredientes()) {
            mensagem += ingrediente.getNome() + " e ";
        }
        mensagem = mensagem.substring(0, mensagem.length() - 3); // Remover o último " e "
        mensagem += "\nValor: " + String.format("%.2f", valorTotal);

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
