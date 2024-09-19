import java.util.Scanner;

public class E52{
	public static void main(String []args){
		Scanner on = new Scanner(System.in);
		Scanner in = new Scanner(System.in);

		int ida=0, quantF=0, quantM=0, somaM=0;
		float mediaH=0, mediaPF=0, peso, somaF=0;

		while(ida!=-1){
			System.out.print("Digite sua idade: ");
			ida = on.nextInt();

			if(ida!=-1 && ida > 0){
				System.out.print("Qual seu peso? ");
				peso = on.nextFloat();
				System.out.print("Qual seu genero? ");
				String sexo = in.nextLine();

				if("F".equals(sexo)){
					++quantF;
					somaF += peso;
				}
				else if("M".equals(sexo)){
					++quantM;
					somaM += ida;
				}

			}
			else
				System.out.println("Digite uma idade valida!");

		}
		if(somaM > 0)
			mediaH = (float) somaM / (float) quantM;
		if(somaF > 0)
			mediaPF = (float) somaF / (float) quantF;

		System.out.println("Total de homens: "+quantM);
		System.out.println("Total de mulheres: "+quantF);
		System.out.println("Media das idades dos homens: "+mediaH);
		System.out.print("Media dos pesos das mulheres: "+mediaPF);
	}
}