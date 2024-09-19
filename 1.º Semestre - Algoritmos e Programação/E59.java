import java.util.Scanner;
public class E59{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] vet = new int[8];
		int i;

		for(i=0; i<vet.length; i++){
			System.out.println("Entre com um número: ");
			vet[i]=in.nextInt();
		}
			System.out.println("A ordem inversa dos números é: ");
		for(i=7; i>=0; i--){
			System.out.println(vet[i]+" ");
		}
	}
}