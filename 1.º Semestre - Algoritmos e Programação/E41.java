import java.util.Scanner;
public class E41 {
	 public static void main (String [] args) {
    	Scanner on = new Scanner (System.in);
    	int a, val, par=0, imp=0, somaP=0, somaI=0;
    	float medP=0,medI=0;

    	for(a=0; a<5; ++a){
    		System.out.println("Insira um numero: ");
    		val=on.nextInt();

    		 if(val!=0)
    		 	if(val%2==0){
    		 		somaP=val+somaP;
    		 		par++;
    		 	}
    		 	else{
    		 		somaI=val+somaI;
    		 		imp++;
    		 	}
    		else{
    			System.out.println("0 é nulo seu bobão!");
    			--a;
    		}

    	}
			if (par>0)
    			medP=somaP / par;
    		if (imp>0)
    			medI=somaI / imp;
    		System.out.println("O resultado da media par é: " +medP);
    		System.out.println("O resultado da media impar é: " + medI);


    }

}