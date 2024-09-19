package br.com.pagamento.newton;

public class FComissionado extends Funcionario {
    private double valorVendas;
    private double taxaComissao;

    public FComissionado(String nome, String matricula, double salarioFixo, double valorVendas,
                         double taxaComissao) {
        super(nome, matricula, salarioFixo);
        this.valorVendas = valorVendas;
        this.taxaComissao = taxaComissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public double calcularProventos() {
        return getSalarioFixo() + (valorVendas * taxaComissao);
    }
}
