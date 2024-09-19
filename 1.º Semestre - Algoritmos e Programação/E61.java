import java.util.Scanner;

public class E61{
	public static void main(String []args){
		Scanner on =  new Scanner(System.in);

			int vet1[] = new int[10]; int vet2[] = new int[10];
			int vetU[] = new int[20];

			for(int i=0; i < vet1.length; ++i){
				System.out.print("Digite numero: ");
				vet1[i] = on.nextInt();
			}
			for(int i=0; i < vet2.length; ++i){
				System.out.print("Digite numero: ");
				vet2[i] = on.nextInt();
			}
			for(int i=0; i < vetU.length; ++i){
				if(i<10){
				vetU[i] = vet1[i];
				vetU[10+i] = vet2[i];
				System.out.print(vetU[i] + " ");
			}
				else
					System.out.print(vetU[i] + " ");
			}
	}
}