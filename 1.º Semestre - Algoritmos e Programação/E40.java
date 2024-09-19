import java.util.Scanner;
public class E40{
	public static void main(String[] args){
		Scanner on = new Scanner(System.in);
		int i, val, neg=0, pos=0, mn=0, mp=0,somaP=0, somaN=0;

		for(i=1; i<=5; i++){
		System.out.println("Escreva um número: ");
		val=on.nextInt();

		if(val!=0)
			if(val>0){
			pos +=1;
			somaP=val+somaP;
			mp=val+somaP/5;

			}
			else {
				neg +=1;
				somaN=val+somaN;
				mn=val+somaN/5;
			}
		else{
			System.out.println("Nulo, use outro número");
			--i;
		}
			}
		System.out.println("A média dos valores negativos são: " + mn);
		System.out.println("A média dos valores positivos são: " + mp);
	}
}
