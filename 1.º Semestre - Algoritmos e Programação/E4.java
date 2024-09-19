import java.util.Scanner;
public class E4 { 
	public static void main (String[] args) {
    
    	Scanner ler = new Scanner(System.in);
    	
    	float nota1, nota2, nota3, media;
    	
    	System.out.println("Entre com as notas do aluno");
    	nota1=ler.nextInt();
    	nota2=ler.nextInt();
    	nota3=ler.nextInt();
    	media=(nota1+nota2+nota3)/3;
    		System.out.printf("O valor da Média é: %.2f", media);
    		
    }
}