import java.util.Scanner;
public class E67{
	public static void main (String []args){
		Scanner on = new Scanner(System.in);
		String vetN[] = new String[3];
		double vetV[] = new double[3];
		int i;

		for(i=0; i<vetN.length; ++i){
			System.out.print("Digite a descrição do produto: ");
			vetN[i]=on.nextLine();
			System.out.print("Digite o preço do produto: ");
			vetV[i]=on.nextDouble();

				on = new Scanner(System.in);
			}

		for(i=0; i<vetV.length; ++i){
			vetV[i]=vetV[i]+vetV[i]*0.1;
			}

		for(i=0; i<vetV.length; ++i){
			System.out.println("Produto: "+vetN[i]);
			System.out.println("Valor: "+vetV[i]);
			System.out.println("--------------------------------");
		}
	}
 }
