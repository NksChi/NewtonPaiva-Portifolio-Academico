import java.util.Scanner;
public class E35{
	public static void main(String []args){
		Scanner ler = new Scanner(System.in);
		int i=0, num;
		float soma=0;

		while(i < 10){
			System.out.print("Digite 10 numeros: ");
			num=ler.nextInt();

			if (num < 40)
				soma = soma + num;
			else{}

			i++;
		}

		System.out.print(soma);
	}
}