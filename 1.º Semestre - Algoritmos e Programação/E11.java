import java.util.Scanner;
public class E11 {

	public static void main (String[] args){

		Scanner ler= new Scanner(System.in);
		Double custo, valDist, valImp, valF;

			System.out.println("O custo da fábrica é:");
			custo=ler.nextDouble();

			valDist=custo*0.12;
			valImp=custo*0.45;

			valF=custo+valImp+valDist;
			System.out.printf("O valor que o consumidor pagou foi : %.2f \n" , valF);
			System.out.printf("O valor que o governo ganhou foi : %.2f \n" , valImp);
			System.out.printf("O valor que da distribuidora foi : %.2f \n" , valDist);



	}

}