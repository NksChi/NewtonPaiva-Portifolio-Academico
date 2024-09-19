import java.util.Scanner;
public class E39{
	public static void main(String[] args){
		Scanner on = new Scanner(System.in);
		int i, val, imp=0, par=0, somaP=0, somaI=0;

		for(i=0; i<=10; ++i){
		System.out.println("Escreva um número inteiro: ");
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
