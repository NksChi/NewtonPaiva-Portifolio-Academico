package br.com.banco.newton;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int num, double saldo, double limite) {
        super(num, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double consultaSaldoTotal(){
        return  getSaldo() + getLimite();
    }
}
