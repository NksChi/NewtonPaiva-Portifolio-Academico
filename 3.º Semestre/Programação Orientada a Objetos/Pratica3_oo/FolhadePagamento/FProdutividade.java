package br.com.pagamento.newton;

public class FProdutividade extends Funcionario {
    private double valorPorUnidade;
    private int quantidadeProduzida;

    public FProdutividade(String nome, String matricula, double salarioFixo, double valorPorUnidade,
                          int quantidadeProduzida) {
        super(nome, matricula, salarioFixo);
        this.valorPorUnidade = valorPorUnidade;
        this.quantidadeProduzida = quantidadeProduzida;
    }

    public double getValorPorUnidade() {
        return valorPorUnidade;
    }

    public void setValorPorUnidade(double valorPorUnidade) {
        this.valorPorUnidade = valorPorUnidade;
    }

    public int getQuantidadeProduzida() {
        return quantidadeProduzida;
    }

    public void setQuantidadeProduzida(int quantidadeProduzida) {
        this.quantidadeProduzida = quantidadeProduzida;
    }
    public String toString() {
        return "Funcionário Produtivo: " + super.getNome();
    }

    public double calcularProventos() {
        return getSalarioFixo() + (valorPorUnidade * quantidadeProduzida);
    }
}
