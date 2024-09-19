package br.com.banco.newton;

public class Conta {
    private int num;
    private double saldo;

    public Conta(int num, double saldo) {
        this.num = num;
        this.saldo = saldo;
    }

    public int getNum() {
        return num;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){
        this.saldo = this.saldo - valor;
        if(valor <= this.saldo);
    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }
}
