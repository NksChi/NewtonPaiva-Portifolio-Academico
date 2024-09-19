import java.util.Scanner;
public class E58{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] vetA = new int[10], vetB = new int[10];
		int i;
		int[] somaV = new int[10];


		for(i=0; i<vetA.length; i++){
			System.out.println("Entre com um número para a soma: ");
			vetA[i]=in.nextInt();
		}
		for(i=0; i<vetB.length; i++){
			System.out.println("Entre com outro número para a soma: ");
			vetB[i]=in.nextInt();
		}
		for(i=0; i<somaV.length; i++){
		somaV[i]=vetA[i]+vetB[i];
		System.out.println("A soma dos números é " + somaV[i] + ".");
		}
	}
}