import java.util.Scanner;
public class E29{
	public static void main(String []args){
		Scanner ler = new Scanner(System.in);
		int op;

		System.out.print("Digite o número do mês: ");
		op=ler.nextInt();

		switch (op){
			case 1:
				System.out.println("Janeiro: É o mês mais frio em grande parte do hemisfério norte");
				System.out.println("Janeiro tem 31 dias");
				break;
			case 2:
				System.out.println("Fevereiro: É o mês mais curto do ano");
				System.out.println("Fevereiro tem 28 ou 29 dias");
				break;
			case 3:
				System.out.println("Março: Em Roma, onde o clima é mediterrânico, março é o primeiro mês da primavera");
				System.out.println("Março tem 31 dias");
				break;
			case 4:
				System.out.println("Abril");
				System.out.println("Abril tem 30 dias");
				break;
			case 5:
				System.out.println("Maio");
				System.out.println("Maio tem 31 dias");
				break;
			case 6:
				System.out.println("Junho");
				System.out.println("Junho tem 30 dias");
				break;
			case 7:
				System.out.println("Julho");
				System.out.println("Julho tem 31 dias");
				break;
			case 8:
				System.out.println("Agosto");
				System.out.println("Agosto tem 31 dias");
				break;
			case 9:
				System.out.println("Setembro");
				System.out.println("Setembro tem 30 dias");
				break;
			case 10:
				System.out.println("Outubro");
				System.out.println("Outubro tem 31 dias");
				break;
			case 11:
				System.out.println("Novembro");
				System.out.println("Novembro tem 30 dias");
				break;
			case 12:
				System.out.println("Dezembro");
				System.out.println("Dezembro tem 31 dias");
				break;
			default:
				System.out.println("Inválido");
		}

	}
}