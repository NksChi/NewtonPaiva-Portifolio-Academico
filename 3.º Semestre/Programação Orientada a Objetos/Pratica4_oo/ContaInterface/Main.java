package br.com.conta2.newton;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1200.20);
        cc.sacar(300);

        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(500.50);
        cp.sacar(25);

        GeradorExtratos ge = new GeradorExtratos();
        ge.gerarExtrato(cc);
        ge.gerarExtrato(cp);
    }
}