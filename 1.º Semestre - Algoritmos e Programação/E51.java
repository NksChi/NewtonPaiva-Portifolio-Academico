import java.util.Scanner;
public class E51{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int i=0, quantApro=0, quantRep=0;
		String nome="aa";
		float n1, n2, n3, mediaN=0, somaN=0, somaG=0, mediaG=0;

		while(!"Fim".equals(nome)){
			System.out.print("Entre com o nome do(a) aluno(a): ");
			nome=in.nextLine();

			++i;

			if(!nome.equals("Fim")){
				System.out.print("Entre com a primeira nota: ");
				n1=in.nextFloat();
				System.out.print("Entre com a segunda nota: ");
				n2=in.nextFloat();
				System.out.print("Entre com a terceira nota: ");
				n3=in.nextFloat();

				somaN = n1 + n2 + n3;

				if(somaN >= 60)
					++quantApro;
				else
					++quantRep;


				somaG= somaG+somaN;
				mediaG= somaG / i;

				in = new Scanner(System.in);

				}
			else{
				System.out.println("Rode novamente quando precisar!");
			}
		}
		System.out.println("A média geral turma é: "+ mediaG);
		System.out.println("A quantidade de aprovados é: "+ quantApro);
		System.out.print("A quantidade de reprovados é: "+ quantRep);
	}
}


