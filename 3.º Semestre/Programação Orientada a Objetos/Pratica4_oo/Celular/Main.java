package br.com.celular.newton;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        CelularFabricanteA celularA = new CelularFabricanteA(true, true, true, false, true, true, 6800.00);
        CelularFabricanteB celularB = new CelularFabricanteB(true, true, true, true, false, true, 5200.00);

        JOptionPane.showMessageDialog(null, "Celular Fabricante A: \n\n" +
                "Enviar mensagem: " + celularA.temEnviarMensagem() + "\n" +
                "Acesso à internet: " + celularA.temAcessarInternet() + "\n" +
                "E-mails: " + celularA.temAcessarEmails() + "\n" +
                "Rádio: " + celularA.temRadio() + "\n" +
                "TV: " + celularA.temTV() + "\n" +
                "Sistema de arquivos: " + celularA.temVerificarSistemaArquivos() + "\n" +
                "Preço: R$ " + celularA.getPreco());

        JOptionPane.showMessageDialog(null, "Celular Fabricante B: \n\n" +
                "Enviar mensagem: " + celularB.temEnviarMensagem() + "\n" +
                "Acesso à internet: " + celularB.temAcessarInternet() + "\n" +
                "E-mails: " + celularB.temAcessarEmails() + "\n" +
                "Rádio: " + celularB.temRadio() + "\n" +
                "TV: " + celularB.temTV() + "\n" +
                "Sistema de arquivos: " + celularB.temVerificarSistemaArquivos() + "\n" +
                "Preço: R$ " + celularB.getPreco());
    }
}
