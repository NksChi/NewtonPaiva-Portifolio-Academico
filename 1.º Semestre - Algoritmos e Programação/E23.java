import java.util.Scanner;
public class E23{
	public static void main (String[] args){
	Scanner ler = new Scanner(System.in);
	int a, b, c;

		System.out.println("Coloque o valor de a do tri�ngulo:");
		a=ler.nextInt();

		System.out.println("Coloque o valor de b do tri�ngulo:");
		b=ler.nextInt();

		System.out.println("Coloque o valor de c do tri�ngulo:");
		c=ler.nextInt();

		if(a==b && a==c)
			System.out.println("Equil�tero");

		else if(a==b || a==c || b==c)
			System.out.println("Is�sceles");
		else
			System.out.println("Escaleno");


	}
}