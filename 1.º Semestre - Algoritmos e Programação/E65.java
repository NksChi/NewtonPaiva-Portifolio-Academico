import java.util.Scanner;
public class E65{
	public static void main(String []args){
		Scanner on = new Scanner(System.in);
		float vet[] = new float[5];
		int i;

		for(i=0; i<vet.length; ++i){
			System.out.print("Entre com um número para o vetor: ");
			vet[i]=on.nextFloat();
			vet[i]=vet[i]*10;
		}

		System.out.println(" ");
		for(i=0; i<vet.length; ++i){
			if(i%2==1)
				System.out.println("Os vetores atualizados são: " + vet[i]);


		}
	}
}