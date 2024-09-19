import java.util.Scanner;
public class E37{
	public static void main(String []args){
		Scanner ler = new Scanner(System.in);

		int i=0, num, par=0, imp=0;

		while(i < 10){
			System.out.print("Digite um numero: ");
			num=ler.nextInt();

			if (num==0)
				System.out.println("Zero sera desconsiderado!");
			else if (num%2==1)
				imp++;
			else
				par++;

			i++;
		}
		System.out.println("\nNumeros pares: "+par);
		System.out.println("Numeros impares: "+imp);
	}
}