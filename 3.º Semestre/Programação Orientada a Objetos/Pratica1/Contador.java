import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = a.nextLine();

        int ContadorDeVogais = 0;
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                ContadorDeVogais++;
            }
        }

        System.out.println("Número de vogais na frase: " + ContadorDeVogais);
    }
}
