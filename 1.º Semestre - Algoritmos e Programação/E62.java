import java.util.Scanner;

public class E62{
	public static void main(String []args){
		Scanner on = new Scanner(System.in);

		double vet[] = new double[10];

		for(int i=0; i < vet.length; ++i){
			System.out.print("Digite o valor: ");
			vet[i] = on.nextDouble();
		}
		for(int i=0; i < vet.length; ++i){
			vet[i] = vet[i] + (vet[i] * 0.1);
		}
		for(int i=0; i < vet.length; ++i){
			System.out.printf("Valores atualizados: %.2f\n",vet[i]);
		}
	}
}