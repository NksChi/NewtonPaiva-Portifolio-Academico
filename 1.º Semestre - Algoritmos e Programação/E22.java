import java.util.Scanner;
public class E22{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int A, B;

		System.out.println("Insira o primeiro número inteiro: ");
			A=ler.nextInt();
		System.out.println("Insira o segundo número inteiro: ");
			B=ler.nextInt();

		if(A>B)
			System.out.print("Ordem crescente é: " + A + ", " + B);
		else if(A == B)
			System.out.print("Números iguais");
		else
			System.out.print("Ordem decrescente é: " + B + ", " + A);

	}
}