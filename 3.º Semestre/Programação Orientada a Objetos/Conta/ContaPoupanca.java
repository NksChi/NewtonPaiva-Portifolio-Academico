package br.com.banco.newton;

public class ContaPoupanca extends Conta{
    private double rendimento;

    public ContaPoupanca(int num, double saldo, double rendimento) {
        super(num, saldo);
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public void AtualizaRendimento(){
        double atual;
        atual = getSaldo() + (getSaldo() * (this.rendimento / 100));
        setSaldo(atual);
    }
}
