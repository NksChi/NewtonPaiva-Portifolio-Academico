package br.com.conta.newton;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();

    public void imprimeExtrato() {
        System.out.println("### Extrato da Conta ###");
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Data: " + sdf.format(date));
    }
}
