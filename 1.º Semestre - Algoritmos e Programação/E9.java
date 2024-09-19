import java.util.Scanner;
public class E9{

		public static void main (String[] args){

			Scanner ler = new Scanner(System.in);
			double altura, base, area;

			System.out.println("Cálcule a área do triângulo usando a altura e a base:");
			altura=ler.nextDouble();
			base=ler.nextDouble();

			area=base*altura/2;
			System.out.println("A área é:" + area);

		}
}