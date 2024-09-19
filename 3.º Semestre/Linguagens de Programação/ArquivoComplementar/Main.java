import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente:");
        String arquivoContas = "C:\\Users\\12116208\\Desktop\\Banco.txt";
        Banco banco = lerArquivoContas(arquivoContas);

        String nomeBanco = JOptionPane.showInputDialog("Digite o nome do banco:");
        banco.setNome(nomeBanco);

        double saldoGeral = banco.calcularSaldoGeral();

        String arquivoSaldoGeral = "C:\\Users\\12116208\\Desktop\\SaldoGeral.txt";
        imprimirSaldoGeral(nomeCliente, arquivoSaldoGeral, nomeBanco, saldoGeral);
    }

    public static Banco lerArquivoContas(String arquivo) {
        Banco banco = new Banco();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length >= 3) {
                    String agencia = dados[0];
                    String numero = dados[1];
                    double saldo = Double.parseDouble(dados[2]);

                    Conta conta = new Conta(agencia, numero, saldo);
                    banco.adicionarConta(conta);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return banco;
    }

    public static void imprimirSaldoGeral(String nomeCliente, String arquivo, String nomeBanco, double saldoGeral) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))) {
            bw.write("Cliente: " + nomeCliente + "\n" +
                    "Banco: " + nomeBanco + "\n" +
                    
                    "Possui o saldo geral de contas de: " + saldoGeral);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
