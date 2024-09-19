import java.util.Scanner ;
public class E15 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in) ;
		Scanner in = new Scanner(System.in) ;

		int gol1, gol2;
		String team1, team2;;


		System.out.println("Fale o nome do primeiro time?");
		team1=ler.nextLine();

		System.out.println("Quantos gols ele marcou?");
		gol1=in.nextInt();

		System.out.println("Fale o nome do segundo time?");
		team2=ler.nextLine();

		System.out.println("Quantos gols ele marcou?");
		gol2=in.nextInt();

		if (gol1>gol2)
			System.out.println("O " + team1 + " ganhou");

		else if (gol1<gol2)
			System.out.println("O " + team2 + " ganhou");

		else
			System.out.println("Os dois times empataram");
	}
}