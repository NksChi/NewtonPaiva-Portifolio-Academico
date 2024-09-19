import java.util.Scanner;
public class E23{
	public static void main (String[] args){
	Scanner ler = new Scanner(System.in);
	int a, b, c;

		System.out.println("Coloque o valor de a do triângulo:");
		a=ler.nextInt();

		System.out.println("Coloque o valor de b do triângulo:");
		b=ler.nextInt();

		System.out.println("Coloque o valor de c do triângulo:");
		c=ler.nextInt();

		if(a==b && a==c)
			System.out.println("Equilátero");

		else if(a==b || a==c || b==c)
			System.out.println("Isósceles");
		else
			System.out.println("Escaleno");


	}
}