import java.util.Scanner;
public class E25{
	public static void main(String[] Args){
	Scanner ler = new Scanner(System.in);
		int idade;

		System.out.println("Insira a idade:");
		idade=ler.nextInt();

		if(idade<18)
			System.out.println("Menor de idade");
		else if(idade>=18 && idade<65)
			System.out.println("Maior de idade");
		else
			System.out.println("Idoso");

	}
}
