import java.util.Scanner;
public class E10{

		public static void main (String[] args){

		Scanner ler = new Scanner(System.in);
		float distancia, litros, consumo;

		System.out.println("Distância percorrida pelo carro :");
		distancia=ler.nextFloat();

		System.out.println("Quantos litros o carro gastou:");
		litros=ler.nextFloat();

		consumo=distancia/litros;
		System.out.println("O carro gastou:" + consumo);


		}
}
