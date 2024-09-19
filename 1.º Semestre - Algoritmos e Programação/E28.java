import java.util.Scanner;
public class E28{
	public static void main(String[] ars){
		Scanner ler = new Scanner(System.in);
		int op;

		System.out.print("Digite o número do mês: ");
		op=ler.nextInt();

		switch (op){
			case 1:
				System.out.println("Janeiro: É o mês mais frio em grande parte do hemisfério norte");
				break;
			case 2:
				System.out.println("Fevereiro: É o mês mais curto do ano");
				break;
			case 3:
				System.out.println("Março: Em Roma, onde o clima é mediterrânico, março é o primeiro mês da primavera");
				break;
			case 4:
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Maio");
				break;
			case 6:
				System.out.println("Junho");
				break;
			case 7:
				System.out.println("Julho");
				break;
			case 8:
				System.out.println("Agosto");
				break;
			case 9:
				System.out.println("Setembro");
				break;
			case 10:
				System.out.println("Outubro");
				break;
			case 11:
				System.out.println("Novembro");
				break;
			case 12:
				System.out.println("Dezembro");
				break;
			default:
		}
	}
}