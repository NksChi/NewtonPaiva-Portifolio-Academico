import java.util.Scanner;
public class E17 {

	public static void main (String[] args) {

	Scanner entrada = new Scanner(System.in);

	int age;

	System.out.println("Digite a idade do nadador para saber sua categoria: ");
    age = entrada.nextInt ();

	if (age < 5 || age > 25)
	System.out.println("Fora da faixa. ");

	else if (age >= 5 && age <= 12)
	System.out.println("Categoria infantil. ");

	else if (age >= 13 && age <= 17)
	System.out.println("Categoria juvenil. ");

	else
	System.out.println("Categoria profissional. ");


    }


}