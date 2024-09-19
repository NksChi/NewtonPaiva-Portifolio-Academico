import java.util.Scanner ;
public class E12 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in) ;

		float number1, number2, number3, numberF ;

		System.out.println("Faça uma soma e veja se ela é positivo ou negativo:") ;
		number1=ler.nextFloat() ;
		number2=ler.nextFloat() ;
		number3=ler.nextFloat() ;

		numberF=number1+number2+number3 ;
		if (numberF>=0)
			System.out.println("Positivo") ;
			else
				System.out.println("Negativo") ;
	}
}