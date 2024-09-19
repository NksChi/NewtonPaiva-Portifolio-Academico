package br.com.acai.newton;
import javax.swing.JOptionPane;

public class pontoacai{
    public static void main(String[] args){
        String[] opcoesTamanho = {"300 ml", "500 ml", "700 ml"};
        int Tamanho = JOptionPane.showOptionDialog(null, "Escolha o tamanho do açaí:",
                "Tamanho do Açaí", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, opcoesTamanho, opcoesTamanho[0]);

        if (Tamanho == JOptionPane.CLOSED_OPTION){
            return;
        }

        int tamanho = 0;
        switch (Tamanho){
            case 0:
                tamanho = 300;
                break;
            case 1:
                tamanho = 500;
                break;
            case 2:
                tamanho = 700;
                break;
            default:
                break;
        }

        String[] opcoesSorvete = {"Sim", "Não"};
        int escolhaSorvete = JOptionPane.showOptionDialog(null,
                "Deseja adicionar sorvete?",
                "Acréscimo de Sorvete", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, opcoesSorvete, opcoesSorvete[1]);

        if (escolhaSorvete == JOptionPane.CLOSED_OPTION){
            return;
        }

       boolean acrescimoSorvete = (escolhaSorvete == 0);

        acai acai1 = new acai(tamanho, acrescimoSorvete);
        double valorFinal = acai1.calcularValor();

        JOptionPane.showMessageDialog(null,
                "O valor do açaí deu R$ " +  valorFinal,
                "Valor do Açaí", JOptionPane.INFORMATION_MESSAGE);
    }
}
