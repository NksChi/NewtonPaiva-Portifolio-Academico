import java.util.Scanner;
public class E46{
	 public static void main (String [] args) {
    	Scanner on = new Scanner (System.in);
    	int i, n, par=0, imp=0;

    	for(i=0; i<10; ++i){
    		System.out.println("Insira um numero: ");
    		n=on.nextInt();

    		 if(n!=0)
    		 	if(n%2==0)
    		 		++par;

    		 	else
    		 		++imp;

    		else{
    			System.out.println("0 � nulo seu bob�o!");
    			--i;
    		}

    	}

    		System.out.println("O resultado de n�meros pares s�o: " + par);
    		System.out.println("O resultado de n�meros pares s�o: " + imp);


    }

}