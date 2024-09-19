import java.util.Scanner;
public class E64{
	public static void main(String []args){
		Scanner on = new Scanner(System.in);
		float vet[]= new float[5];
		float A, aux=0;
		int B=0;

		for(int i=0; i<vet.length; ++i){
			System.out.print("Entre com um número: ");
			vet[i]=on.nextFloat();
		}

		System.out.println(" ");
		System.out.println("Pesquise dentro do vetor o número: ");
		A=on.nextFloat();
		for(int i=0; i<vet.length; ++i){
			if(A==vet[i]){
				aux=vet[i];
				B=i;
			}
		}

		if(aux==0)
			System.out.println("O número não foi encontrado");
		else{
			System.out.println(aux + " foi encontrado dentro do vetor.");
			System.out.println("Dentro do indice: " + B + ".");
		}
	}
}