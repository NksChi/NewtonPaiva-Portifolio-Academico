import java.util.Scanner ;
public class E14 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in) ;

		int number1;

		System.out.println("Insira um número e veja se ela é par, ímpar ou nulo:") ;
		number1=ler.nextInt() ;

		if (number1==0)
			System.out.printf("Nulo");
		else if (number1%2==0)
			System.out.printf("Par");
		else
			System.out.printf("Ímpar");


	}
}