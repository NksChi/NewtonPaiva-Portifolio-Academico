import java.util.Scanner;

public class E63{
	public static void main(String []args){
		Scanner on = new Scanner(System.in);

		float vet[] = new float[5];
		float numM=0; int pos=0;

		for(int i=0; i < vet.length; ++i){
			System.out.print("Digite um numero: ");
			vet[i] = on.nextFloat();
		}

		numM = vet[0];

		for(int i=0; i < vet.length; ++i){
			if(numM>=vet[i]){
				numM = vet[i];
				pos = i;
			}

		}

		System.out.println("Menor valor digitado: " + numM + "\nEstá no indice: " + pos);
	}
}