import java.util.Scanner;
public class E33{
	public static void main(String []args){
		Scanner ler = new Scanner(System.in);

		int  i=0;
		float med, soma=0, num;

		while (i<5){
			System.out.print("Digite um numero: ");
			num=ler.nextInt();

			soma=soma+num;
			i++;
		}
		med=soma/i;
		System.out.println("-----------------------------------");
		System.out.println(soma);
		System.out.print(med);
	}
}