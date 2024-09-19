import java.util.Scanner;
public class E26{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		double val, valV;
		String prod;

		System.out.println("O produto inserido é:");
		prod=ler.nextLine();
		System.out.println("Insira o valor do produto:");
		val=ler.nextDouble();

		if (val<100){
			valV=val*0.7;
			System.out.println("Nome do produto: " + prod);
			System.out.printf("Valor do produto: %.2f\n", val);
			System.out.printf("Valor da venda: %.2f\n", valV);
		}
		else if(val>=100 && val<201){
			valV=val*0.5;
			System.out.println("Nome do produto: " + prod);
			System.out.printf("Valor do produto: %.2f\n", val);
			System.out.printf("Valor da venda: %.2f\n", valV);
		}
		else{
			valV=val*0.3;
			System.out.println("Nome do produto: " + prod);
			System.out.printf("Valor do produto: %.2f\n", val);
			System.out.printf("Valor da venda: %.2f\n", valV);

		}
	}
}