import java.util.Scanner;
public class E30{
	public static void main(String []args){
		Scanner ler = new Scanner(System.in);
		int id;
		double pay, payN, aumt;

		System.out.println("--------------------TABELA--------------------");
		System.out.println("ID da Função    Descrição da Função    Aumento");
		System.out.println("    1           Gerente                  30%  ");
		System.out.println("    2           Vendedor                 40%  ");
		System.out.println("    3           Programador              50%  ");
		System.out.println("    4           Motorista                60%  ");
		System.out.println("    5           Vereador                  0%  ");
		System.out.println("    6           Deputado                  0%  ");
		System.out.println("----------------------------------------------\n");

		System.out.print("Informe o ID da sua função: ");
		id=ler.nextInt();
		System.out.print("Informe seu salário atual: ");
		pay=ler.nextFloat();

		System.out.println("----------------------------------------------\n");

		switch(id){
			case 1:
				aumt=pay*0.3;
				payN=aumt+pay;
				System.out.printf("O aumento que você recebeu foi de: %.2f\n",aumt);
				System.out.printf("O novo salário que você recebeu é: %.2f\n",payN);
				break;
			case 2:
				aumt=pay*0.4;
				payN=aumt+pay;
				System.out.printf("O aumento que você recebeu foi de: %.2f\n",aumt);
				System.out.printf("O novo salário que você recebeu é: %.2f\n",payN);
				break;
			case 3:
				aumt=pay*0.5;
				payN=aumt+pay;
				System.out.printf("O aumento que você recebeu foi de: %.2f\n",aumt);
				System.out.printf("O novo salário que você recebeu é: %.2f\n",payN);
				break;
			case 4:
				aumt=pay*0.6;
				payN=aumt+pay;
				System.out.printf("O aumento que você recebeu foi de: %.2f\n",aumt);
				System.out.printf("O novo salário que você recebeu é: %.2f\n",payN);
				break;
			case 5:
				aumt=pay*0;
				payN=aumt+pay;
				System.out.printf("O aumento que você recebeu foi de: %.2f\n",aumt);
				System.out.printf("O novo salário que você recebeu é: %.2f\n",payN);
				System.out.println("Você não está apto para receber reajuste salarial!");
				break;
			case 6:
				aumt=pay*0;
				payN=aumt+pay;
				System.out.printf("O aumento que você recebeu foi de: %.2f\n",aumt);
				System.out.printf("O novo salário que você recebeu é: %.2f\n",payN);
				System.out.println("Você não está apto para receber reajuste salarial!");
				break;
		}
		System.out.println("----------------------------------------------");
	}
}