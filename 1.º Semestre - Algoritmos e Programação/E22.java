import java.util.Scanner;
public class E22{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int A, B;

		System.out.println("Insira o primeiro n�mero inteiro: ");
			A=ler.nextInt();
		System.out.println("Insira o segundo n�mero inteiro: ");
			B=ler.nextInt();

		if(A>B)
			System.out.print("Ordem crescente �: " + A + ", " + B);
		else if(A == B)
			System.out.print("N�meros iguais");
		else
			System.out.print("Ordem decrescente �: " + B + ", " + A);

	}
}