import java.util.Scanner;
public class E43{
	public static void main(String [] args){
		Scanner on = new Scanner(System.in);
		int aAprovado=0, aReprovado=0;
		float n1, n2, n3, medT, somaT=0, somaN;

		for(int i=0; i<3; ++i){

			System.out.print("Insira o nome do aluno: ");
			String nome = on.nextLine();
			System.out.print("Insira a primeira nota: ");
			n1 = on.nextFloat();
			System.out.print("Insira a segunda nota: ");
			n2 = on.nextFloat();
			System.out.print("Insira sua terceira nota: ");
			n3 = on.nextFloat();

			on = new Scanner(System.in);

			somaN = n1 + n2 + n3;
			if(somaN >= 60)
				++aAprovado;
			else
				++aReprovado;

			somaT += somaN;
		}
		medT = somaT / 3;

		System.out.println("Alunos aprovados: "+aAprovado);
		System.out.println("Alunos reprovados: "+aReprovado);
		System.out.printf("Media geral da turma: %.2f", medT);
	}
}