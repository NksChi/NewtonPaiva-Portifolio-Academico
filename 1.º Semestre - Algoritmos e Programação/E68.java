// vetor > matriz

import java.util.Random;
public class E68{
	public static void main(String []args){
		Random on = new Random();
		int mat[][] = new int[2][5];
		int vet[] = new int[10];
		int i, j, cont=0;

		for(i=0; i<2; i++){
			for(j=0; j<5;j++){
				vet[cont]=on.nextInt(100);
				mat[i][j]=vet[cont];
				System.out.print(mat[i][j] + " ");
				cont++;
			}

			System.out.println(" ");

		}
	}
}