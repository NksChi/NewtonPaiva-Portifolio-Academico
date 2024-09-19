package br.com.newton.main;
import br.com.newton.agenda.Contato;
import java.util.Scanner;

public class Telefone {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Contato contato1 = new Contato();

        System.out.print("Digite o nome do contato: ");
        String nome = ler.nextLine();
        contato1.setNome(nome);

        System.out.print("Digite o ddd do contato: ");
        String ddd = ler.nextLine();
        contato1.setDdd(ddd);

        System.out.print("Digite o número do contato: ");
        String telefone = ler.nextLine();
        contato1.setTelefone(telefone);

        if (contato1.getTelefone().length() != 9) {
            System.out.println("Telefone inválido!");
        }

        else {
            System.out.println("Contato adicionado!");
            System.out.println("Nome: " + nome);
            System.out.println("Telefone: " + "(" + ddd + ")" + telefone);
        }

        System.out.println("Digite o contato para excluir: ");
        String nomeE = ler.nextLine();
        contato1.excluir(nomeE);

        System.out.println("Digite o contato para adicionar: ");
        String add = ler.nextLine();
        contato1.add(add);

    }
}
