import java.util.Scanner;
public class E48{
	public static void main(String[] args){
		Scanner on = new Scanner(System.in);
		int n=0
			, par=0, imp=0, somaImp=0;

		while(n!=-1){
			System.out.println("Entre com um n�mero, se n�o quiser digite -1: ");
			n=on.nextInt();

			if(n%2==0)
				par++;

			else
				imp++;

			somaImp=imp+n;
		}

			System.out.println("A quantidade de n�meros pares s�o: " + par);
			System.out.println("A soma dos n�meros impares s�o: " + somaImp);

	}
}