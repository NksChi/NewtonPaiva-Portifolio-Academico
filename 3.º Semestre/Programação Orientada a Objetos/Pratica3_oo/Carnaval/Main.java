import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Object[] opcoes = {"Ingresso Normal", "Ingresso VIP", "Ingresso Camarote"};
        int opcao = JOptionPane.showOptionDialog(null, "Selecione uma opção", "Opções",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

        switch (opcao) {
            case 1 -> {
                Ingresso ingressoNormal = new Normal(50);
                JOptionPane.showMessageDialog(null, "Valor do Ingresso Normal: R$ " +
                        ingressoNormal.getValor());
            }
                
            case 2 -> {
                Ingresso ingressoVIP = new VIP(100, 30);
                JOptionPane.showMessageDialog(null, "Valor do Ingresso VIP: R$ " +
                        ingressoVIP.getValor());
            }
                
            case 3 -> {
                Ingresso ingressoCamarote = new Camarote(150, "Setor A", 50);
                JOptionPane.showMessageDialog(null,
                        "Valor do Ingresso de Camarote: R$ " + ingressoCamarote.getValor() + "\n" +
                                "Localização: " + ((Camarote) ingressoCamarote).getLocalizacao());
            }
        }
    }
}
