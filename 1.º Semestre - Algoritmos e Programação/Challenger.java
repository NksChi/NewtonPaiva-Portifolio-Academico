import java.util.Scanner;
public class Challenger {

	public static void main (String[] args){

		Scanner ler=new Scanner (System.in);
		int A, B, C;

		System.out.println("Insira o valor de A abaixo :");
		A=ler.nextInt();
		System.out.println("Insira o valor de B abaixo :");
		B=ler.nextInt();

		C=A;
		A=B;
		B=C;

		System.out.println("O valor de A mudou para:" + A);
		System.out.println("O valor de B mudou para:" + B);





	}
}