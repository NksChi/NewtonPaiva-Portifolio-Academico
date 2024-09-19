import java.util.Scanner;
public class E1{
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String nome;
		int idade;
		float peso;
		
		System.out.println(" Nome ");
		nome=ler.nextLine();
		
		System.out.println(" idade ");
		idade=ler.nextInt();
		
		System.out.println(" peso ");
		peso=ler.nextFloat();
		
		System.out.println();
		System.out.println("Nome:" + nome + "idade:" + idade);
		System.out.printf("peso: %.2f", peso);
					   
	}
}