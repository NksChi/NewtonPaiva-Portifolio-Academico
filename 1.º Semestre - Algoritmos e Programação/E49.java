import java.util.Scanner;
public class E49{
	public static void main(String[] args){
		Scanner on = new Scanner(System.in);
		int n=55, pos=0, neg=0, somaP=0;

		while(n!=0){
			System.out.println("Entre com um n�mero, se n�o quiser digite 0: ");
			n=on.nextInt();

			if(n>0)
				pos++;

			else if(n<0)
					neg++;
			else

			somaP=pos+n;
		}

			System.out.println("A quantidade de n�meros negativos s�o: " + neg);
			System.out.println("A soma dos n�meros positivos s�o: " + somaP);

	}
}