import java.util.Scanner ;
public class E13 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in) ;

		float number1;

		System.out.println("Insira um número e veja se ela é positivo, negativo ou nulo:") ;
		number1=ler.nextFloat() ;

		if (number1>0)
			System.out.println("Positivo");
		else if	(number1<0)
			System.out.println("Negativo");
		else
			System.out.println("Nulo") ;

	}
}