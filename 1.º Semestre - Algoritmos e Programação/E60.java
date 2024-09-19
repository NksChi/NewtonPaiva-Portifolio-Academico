import java.util.Scanner;
public class E60{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int i;
		String[] nome = new String[8];

		for(i=0; i<=7; i++){
			System.out.println("Entre com um nome: ");
			nome[i]=in.nextLine();
		}
			System.out.println("Os nomes digitados foram: ");
		for(i=7; i>=0; i--){
			System.out.println(nome[i]+" ");
		}
	}
}