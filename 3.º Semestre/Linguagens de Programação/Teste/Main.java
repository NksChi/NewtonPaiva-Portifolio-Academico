//Try/Catch

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.print("Digite um valor inteiro: ");
            int num1 = s.nextInt();
            System.out.print("Digite outro valor inteiro: ");
            int num2 = s.nextInt();

            System.out.println("A soma do primeiro valor mais o segundo valor é: " + (num1+num2));
        }
        catch(Exception ex){
            System.out.println("Erro - valor digitado não é um número inteiro");
        }
    }
}
