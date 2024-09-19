package br.com.rendimentos.newton;

public class Rendimentos {
    private final double investimentoInicial;
    private final double taxaMensal;
    private final int numMeses;

    public Rendimentos(double investimentoInicial, double taxaMensal, int numMeses) {
        this.investimentoInicial = investimentoInicial;
        this.taxaMensal = taxaMensal * 0.01;
        this.numMeses = numMeses;
    }

    public double[] calcularRendimento() {
        double[] valoresFinais = new double[numMeses];

        double valorAtual = investimentoInicial;

        for (int i = 0; i < numMeses; i++) {
            double rendimento = valorAtual * taxaMensal;
            valorAtual += rendimento;
            valoresFinais[i] = valorAtual;
        }

        return valoresFinais;
    }
}


