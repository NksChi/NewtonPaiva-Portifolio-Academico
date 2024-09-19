import java.util.Scanner;
public class E36{
	public static void main(String []args){
		Scanner ler = new Scanner(System.in);

		int i=0, ida, tot2=0, tot5=0;

		while(i < 10){
			System.out.print("Digite idade: ");
			ida=ler.nextInt();

			if (ida <= 21)
				tot2++;
			else if (ida > 55)
				tot5++;
			else{}
			i++;
		}
		System.out.println("\nCom menos de 21 anos: "+tot2);
		System.out.println("Com mais de 50 anos: "+tot5);

	}
}