import java.util.Scanner;
public class E27{
	public static void main(String[] ars){
		Scanner ler = new Scanner(System.in);
		int idade;
		String nome;

		System.out.println("Insira o nome do paciente:");
		nome=ler.nextLine();
		System.out.println("Insira a idade do paciente para ser direcionado:");
		idade=ler.nextInt();

		if(idade<13)
			System.out.println(nome +" v� at� � Pediatria");
		else if(idade>=12 && idade<60)
			System.out.println(nome +" v� at� � Cl�nica Geral ");
		else
			System.out.println(nome +" v� at� � Geriatria");

	}
}