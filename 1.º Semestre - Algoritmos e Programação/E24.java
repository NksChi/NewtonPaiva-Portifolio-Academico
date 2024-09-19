import java.util.Scanner;
public class E24{
	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);
	int a, b, soma;

		System.out.println("Insira um número para a soma:");
		a=ler.nextInt();
		System.out.println("Insira um número para a soma:");
		b=ler.nextInt();

		soma=a+b;

		if(soma>10)
			System.out.println(" A soma é " + soma);

	}
}
