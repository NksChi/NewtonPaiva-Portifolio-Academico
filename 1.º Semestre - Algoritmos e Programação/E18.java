import java.util.Scanner;
public class E18{
	public static void	main(String[] args){
		Scanner ler = new Scanner(System.in);
		double sal, reajuste, salN;

		System.out.print("Digite seu salário: ");
		sal=ler.nextDouble();

		if (sal<=500)
		{
			reajuste=sal*0.15;
			salN=reajuste+sal;
			System.out.printf("Seu salário teve o um reajuste de: %.2f \n", reajuste);
			System.out.printf("Seu novo salário e de: %.2f \n", salN);
		}
		else if (sal>500 & sal<=1000)
		{
			reajuste=sal*0.1;
			salN=reajuste+sal;
			System.out.printf("Seu salário teve o um reajuste de: %.2f\n", reajuste);
			System.out.printf("Seu novo salário e de: %.2f\n", salN);
		}
		else
		{
			reajuste=sal*0.05;
			salN=reajuste+sal;
			System.out.printf("Seu salário teve o um reajuste de: %.2f\n", reajuste);
			System.out.printf("Seu novo salário e de: %.2f\n", salN);
		}

	}
}