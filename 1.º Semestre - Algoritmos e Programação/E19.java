import java.util.Scanner;
public class E19{
	public	static void main(String []args){
		Scanner ler = new Scanner(System.in);
		int idade;

		System.out.print("Digite sua idade: ");
		idade = ler.nextInt();

		if (idade < 16)
			System.out.println("Voce nao e elegivel a voto!");
		else if (idade >= 18 & idade < 66)
			System.out.println("Eleitor obrigatorio!");
		else
			System.out.println("Eleitor facultativo");
	}
}