import java.util.Scanner;
public class E53 {
	public static void main (String [] args) {
	Scanner on = new Scanner (System.in);

	float n=1,soma=0,med,cont=0;
	do {
	System.out.println("Entre com o número: ");
	n=on.nextFloat();

	if (n!=0){
	soma=n+soma;
	cont++;
	}
	}
	while (n!=0);
	med=soma/cont;
	System.out.println("A média dos números inseridos é igual a: "+med);
	}
}