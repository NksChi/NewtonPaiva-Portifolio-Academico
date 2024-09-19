import java.util.Scanner;
public class E34{
	public static void main(String []args){
		Scanner ler = new Scanner(System.in);

		int i=0;
		double num, somaP = 0, somaN = 0;

		while(i<10){
			System.out.print("Digite um numero: ");
			num=ler.nextDouble();

			if (num<0)
				somaN=somaN+num;
			else
				somaP=somaP+num;
			i++;
		}
		System.out.println("\n");
		System.out.println(somaP);
		System.out.println(somaN);
	}
}