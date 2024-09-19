import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempo = a.nextDouble();

        System.out.print("Digite a velocidade média (em km/h): ");
        double velocidade = a.nextDouble();

        System.out.print("Digite o consumo de combustível do veículo (em km/l): ");
        double consumo = a.nextDouble();

        double distancia = tempo * velocidade;
        double combustivelGasto = distancia / consumo;

        System.out.printf("O consumo final de combustível gasto foi de %.2f litros", combustivelGasto);
    }
}
