import java.util.Scanner;
public class E38{
	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);
	int i=1,xp=0, xn=0, n, somap=0, soman=0;

	while(i<=15){
		System.out.println("entre com um número:");
		n=ler.nextInt();

		if(n>0){
			xp++;
			somap=somap+n;
		}
		else if(n<0){
			xn++;
			soman=soman+n;
		}
		else
			i=i-1;
		i++;
		}

		System.out.println("A quantidade de números positivos é:" + xp);
		System.out.println("A quantidade de números negativos é:" + xn);
		System.out.println("A soma de números positivos é:" + somap);
		System.out.println("A soma de números neativos é:" + soman);

	}
}