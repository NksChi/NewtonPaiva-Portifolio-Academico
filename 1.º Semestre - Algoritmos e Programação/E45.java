import java.util.Scanner;
public class E45{
	public static void main(String[] args){
	Scanner on = new Scanner(System.in);
	int i, n, soma=0;

	for(i=0; i<10; ++i){

	System.out.println("Entre com um n�mero: ");
	n=on.nextInt();

	if(n<40)
		soma+=n;

	}

	System.out.println("A soma dos n�meros menores que 40 �: " + soma);

	}
}