import java.util.Scanner;
public class E21 {

	public static void main (String[] args){
		Scanner ler = new Scanner(System.in);

		int n1, n2;

		System.out.println("Entre com um n�mero");
		n1=ler.nextInt();

		System.out.println("Entre com um segundo n�mero");
		n2=ler.nextInt();

		if (n1>n2)
			System.out.println("A ordem crescente �:" + n2 + " e " + n1);

		else
			System.out.println("A ordem crescente �:" + n1 + " e " + n2);







	}
}