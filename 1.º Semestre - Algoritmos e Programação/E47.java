import java.util.Scanner;
public class E47{
	public static void main(String[] args){
		Scanner on = new Scanner(System.in);
		int i, n, imp=0, par=0, somaP=0, somaI=0;

		for(i=0; i<15; ++i){
		System.out.println("Escreva um número inteiro: ");
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
			System.out.println("Nulo, tente outro número");
			--i;
		}
		}
			System.out.println("A quantidade de números pares é:" + par);
			System.out.println("A quantidade de números ímpares é:" + imp);
			System.out.println("A soma de números pares é:" + somaP);
			System.out.println("A soma de números ímpares é:" + somaI);
	}
}