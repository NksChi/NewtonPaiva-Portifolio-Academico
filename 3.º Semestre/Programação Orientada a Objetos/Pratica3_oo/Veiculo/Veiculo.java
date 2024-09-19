package br.com.veiculo.newton;

public class Veiculo {
    private final String placa;
    private final int ano;

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public String exibirDados() {
        return "Placa: " + placa + "\nAno: " + ano;
    }
}
