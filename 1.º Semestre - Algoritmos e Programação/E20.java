import java.util.Scanner;
public class E20{
	public static void main(String []args){
		Scanner ler = new Scanner(System.in);
		float a, b, c;

		System.out.println("Digite dois números: ");
		a=ler.nextFloat();
		b=ler.nextFloat();

		if (a==b){
			c = a + b;
			System.out.println("A soma entre " + a + " e " + b + " é " + c);
		}
		else{
			c = a * b;
			System.out.println("A Mult entre " + a + " e " + b + " é " +c);
		}
	}
}