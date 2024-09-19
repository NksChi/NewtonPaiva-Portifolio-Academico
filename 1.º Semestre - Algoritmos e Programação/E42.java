import java.util.Scanner;
public class E42{
    public static void main (String[] args){
    	Scanner on = new Scanner(System.in);
    	int a, ida, n70=0, i20=0, somaN=0, nota;
    	float med=0;

    for(a=0; a<30; ++a){
    	System.out.println("Coloque a nota final:");
		nota=on.nextInt();
		System.out.println("Agora insira a idade: ");
		ida=on.nextInt();

		somaN=somaN+nota;
		if (nota>70)
			++n70;
		if(ida > 20)
			++i20;
	}

	med = somaN/i20;
	System.out.println("Quantidade de alunos com nota maior que 70: "+ n70);
	System.out.println("Quantidade de alunos com idade maior que 20: " +i20);
	System.out.printf("Media geral da turma foi: %.2f", med);

	}
}