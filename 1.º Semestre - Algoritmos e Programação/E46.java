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
    			System.out.println("0 é nulo seu bobão!");
    			--i;
    		}

    	}

    		System.out.println("O resultado de números pares são: " + par);
    		System.out.println("O resultado de números pares são: " + imp);


    }

}