package br.com.pagamento.newton;

public class FPadrao extends Funcionario {
    public FPadrao(String nome, String matricula, double salarioFixo) {
        super(nome, matricula, salarioFixo);
    }

    public double calcularProventos() {
        return getSalarioFixo();
    }
}
