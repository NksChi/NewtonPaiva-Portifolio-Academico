import java.util.Scanner;
public class E44{
	public static void main(String[] args){
	Scanner on = new Scanner(System.in);
	int i, n, somaN=0, somaP=0;

	for(i=0; i<10; ++i){
		System.out.println("Entre com um número: ");
		n=on.nextInt();

		if(n<0)
			somaN+=n;
		else if(n>0)
			somaP+=n;
		else
			--i;

	}

	System.out.println("A soma dos números positivos é: " + somaP);
	System.out.println("A soma dos números negativos é: " + somaN);

	}
}