import java.util.Scanner ;
public class E16 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in) ;
		float number1;

		System.out.println("Insira um n�mero e veja se ele � divis�vel por 5:") ;
		number1=ler.nextFloat() ;

		if (number1 % 5 == 0)
			System.out.println("Ele � divis�vel");
		else
			System.out.printf("Ele n�o � divis�vel");
	}
}