import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String Nomes = "C:\\Users\\12116208\\Desktop\\Projeto\\ArquivoNomes.txt";
        String Sobrenomes = "C:\\Users\\12116208\\Desktop\\Projeto\\ArquivoSobreNomes.txt";
        String Resultado = "C:\\Users\\12116208\\Desktop\\Projeto\\Resultado.txt";

        try {
            BufferedReader n = new BufferedReader(new FileReader(Nomes));
            String linha;
            System.out.println("Nomes:");
            while ((linha = n.readLine()) != null) {
                System.out.println(linha);
            }
            n.close();

            BufferedReader sn = new BufferedReader(new FileReader(Sobrenomes));
            System.out.println("\nSobrenomes:");
            while ((linha = sn.readLine()) != null) {
                System.out.println(linha);
            }
            sn.close();

            BufferedWriter escritorResultado = new BufferedWriter(new FileWriter(Resultado));
            BufferedReader n2 = new BufferedReader(new FileReader(Nomes));
            BufferedReader sn2 = new BufferedReader(new FileReader(Sobrenomes));
            System.out.println("\nNomes e sobrenomes concatenados:");
            while ((linha = n2.readLine()) != null) {
                String sobrenome = sn2.readLine();
                String nomeSobrenome = linha + " " + sobrenome;
                System.out.println(nomeSobrenome);
                escritorResultado.write(nomeSobrenome);
                escritorResultado.newLine();
            }
            n2.close();
            sn2.close();
            escritorResultado.close();

            System.out.println("\nArquivo com nomes e sobrenomes concatenados criado com sucesso!");

        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}

