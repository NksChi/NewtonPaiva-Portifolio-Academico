import java.util.Scanner;
public class E47{
	public static void main(String[] args){
		Scanner on = new Scanner(System.in);
		int i, n, imp=0, par=0, somaP=0, somaI=0;

		for(i=0; i<15; ++i){
		System.out.println("Escreva um n�mero inteiro: ");
		n=on.nextInt();

		if(n!=0)
			if(n%2==1){
				++imp;
				somaI+=n;
			}
			else{
				++par;
				somaP+=n;
			}
		else{
			System.out.println("Nulo, tente outro n�mero");
			--i;
		}
		}
			System.out.println("A quantidade de n�meros pares �:" + par);
			System.out.println("A quantidade de n�meros �mpares �:" + imp);
			System.out.println("A soma de n�meros pares �:" + somaP);
			System.out.println("A soma de n�meros �mpares �:" + somaI);
	}
}