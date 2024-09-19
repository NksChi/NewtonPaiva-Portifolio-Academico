package br.com.PublicacaoNewton;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String dataCriacao = JOptionPane.showInputDialog("Digite a data de criação da rede social:");
        String nomeUsuario = JOptionPane.showInputDialog("Digite o nome do usuário:");
        String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento:");
        String senha = JOptionPane.showInputDialog("Digite a senha:");

        RedeSocial redeSocial = new RedeSocial(dataCriacao, nomeUsuario, dataNascimento, senha);

        int numPublicacoes = Integer.parseInt(JOptionPane.showInputDialog
                                              ("Digite o número de publicações a serem cadastradas:"));

        for (int i = 0; i < numPublicacoes; i++) {
            String dataPublicacao = JOptionPane.showInputDialog("Digite a data da publicação:");
            String textoPublicacao = JOptionPane.showInputDialog("Digite o texto da publicação:");
            String linkMidia = JOptionPane.showInputDialog("Digite o link da mídia (opcional):");

            Publicacao publicacao = new Publicacao(dataPublicacao, textoPublicacao, linkMidia);
            redeSocial.inserePublicacao(publicacao);
        }

        redeSocial.imprimePublicacoes();
    }
}

