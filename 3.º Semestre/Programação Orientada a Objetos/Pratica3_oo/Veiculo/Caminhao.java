package br.com.veiculo.newton;
import javax.swing.JOptionPane;

public final class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public String exibirDados() {
        String mensagem = super.exibirDados() + "\nEixos: " + getEixos();
        return mensagem;
    }
}
