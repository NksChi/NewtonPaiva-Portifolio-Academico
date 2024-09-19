import java.util.Scanner;

public class E56{
	public static void main(String []args){
		Scanner on = new Scanner(System.in);

		float num, quantP=0, quantN=0, somaP=0, somaN=0;

		do{
			System.out.print("Digite um numero: ");
			num = on.nextFloat();

			if(num!=0){
				if(num>0){
					++quantP;
					somaP += num;
				}
				else{
					++quantN;
					somaN += num;
				}
			}
		}
		while(num!=0);

		System.out.println("Quantidade de numero positivos: "+quantP);
		System.out.println("Quantidade de numero negativos: "+quantN);
		System.out.println("Soma dos numeros positivos: "+somaP);
		System.out.print("Soma dos numeros positivos: "+somaN);
	}
}