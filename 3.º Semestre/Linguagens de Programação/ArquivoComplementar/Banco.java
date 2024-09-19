import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private final List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public double calcularSaldoGeral() {
        double saldoGeral = 0;
        for (Conta conta : contas) {
            saldoGeral += conta.getSaldo();
        }
        return saldoGeral;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
