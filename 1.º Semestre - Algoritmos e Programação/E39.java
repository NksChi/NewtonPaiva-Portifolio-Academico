import java.util.Scanner;
public class E39{
	public static void main(String[] args){
		Scanner on = new Scanner(System.in);
		int i, val, imp=0, par=0, somaP=0, somaI=0;

		for(i=0; i<=10; ++i){
		System.out.println("Escreva um n�mero inteiro: ");
		val=on.nextInt();

		if(val!=0)
			if(val%2==1){
				imp +=1;
				somaI=val+somaI;
			}
			else{
				par +=1;
				somaP=val+somaP;
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
