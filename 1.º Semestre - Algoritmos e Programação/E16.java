import java.util.Scanner ;
public class E16 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in) ;
		float number1;

		System.out.println("Insira um número e veja se ele é divisível por 5:") ;
		number1=ler.nextFloat() ;

		if (number1 % 5 == 0)
			System.out.println("Ele é divisível");
		else
			System.out.printf("Ele não é divisível");
	}
}