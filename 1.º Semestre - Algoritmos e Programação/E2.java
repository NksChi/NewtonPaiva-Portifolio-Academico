import java.util.Scanner;
public class E2 {
	
	public static void main (String[] args) {
    	
    	Scanner entrada = new Scanner(System.in);
    	
    	double num, quadrado;
    	
    	System.out.println("Entre com um número para calcular seu quadrado");
    	num=entrada.nextDouble();
    	
    	quadrado = Math.pow(num,2);
    	System.out.println("O quadrado do numero" + num + "é:" + quadrado);
    }
}