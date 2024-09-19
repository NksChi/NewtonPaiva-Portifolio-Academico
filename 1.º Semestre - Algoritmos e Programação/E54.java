import java.util.Scanner;

public class E54{
	public static void main(String []args){
		Scanner on = new Scanner(System.in);

		float soma=0, num;

		do{
			System.out.print("Digite um numero: ");
			num = on.nextFloat();

			if(num > 5)
				soma += num;
		}
		while(num != 0);

		System.out.printf("A soma dos numeros maiores que 5 digitados e: %.2f", soma);
	}
}