package br.com.conta2.newton;

public interface Conta {
    void depositar(double valor);
    void sacar(double valor);
    double getSaldo();
}
