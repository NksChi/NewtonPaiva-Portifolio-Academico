
import java.util.Scanner;

public class Placa {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Digite a placa do carro: ");
        String placa = a.nextLine().toLowerCase();

        System.out.print("Digite o ano de fabricação do carro: ");
        int ano = a.nextInt();

        if (ano < 2010) {
            System.out.println("Carro Velho");
        } else if (ano >= 2011 && ano <= 2021) {
            System.out.println("Carro Semi novo");
        } else if (ano >= 2022) {
            System.out.println("Carro Novo");
        }

        placa = placa.replaceAll("[aeiouAEIOU]", "*");

        System.out.println("Placa com vogais substituídas: " + placa);
    }
}
