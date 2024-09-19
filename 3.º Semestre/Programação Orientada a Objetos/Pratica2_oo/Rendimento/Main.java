package br.com.rendimentos.newton;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Digite o investimento inicial: ");
        double investimentoInicial = a.nextDouble();

        System.out.print("Digite a taxa mensal de rendimento (%): ");
        double taxaMensal = a.nextDouble();

        System.out.print("Digite o número de meses do investimento: ");
        int numMeses = a.nextInt();

        Rendimentos investimento = new Rendimentos(investimentoInicial, taxaMensal, numMeses);
        double[] valorF = investimento.calcularRendimento();
        System.out.print("┌─────┬──────────┐\n");
        System.out.print("│ Mês │Rendimento│\n");
        System.out.print("├─────┼──────────┤\n");
        for (int i = 0; i < numMeses; i++) {
            System.out.printf("│ %2d  │ R$%7.2f│\n", i+1, valorF[i]);
            System.out.print("└─────┴──────────┘\n");
        }
    }
}
