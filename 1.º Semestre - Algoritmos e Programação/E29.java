import java.util.Scanner;
public class E29{
	public static void main(String []args){
		Scanner ler = new Scanner(System.in);
		int op;

		System.out.print("Digite o n�mero do m�s: ");
		op=ler.nextInt();

		switch (op){
			case 1:
				System.out.println("Janeiro: � o m�s mais frio em grande parte do hemisf�rio norte");
				System.out.println("Janeiro tem 31 dias");
				break;
			case 2:
				System.out.println("Fevereiro: � o m�s mais curto do ano");
				System.out.println("Fevereiro tem 28 ou 29 dias");
				break;
			case 3:
				System.out.println("Mar�o: Em Roma, onde o clima � mediterr�nico, mar�o � o primeiro m�s da primavera");
				System.out.println("Mar�o tem 31 dias");
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
				System.out.println("Inv�lido");
		}

	}
}