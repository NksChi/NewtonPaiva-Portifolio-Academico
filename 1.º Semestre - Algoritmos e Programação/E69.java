// matriz > vetor

import java.util.Random;
public class E69{
	public static void main(String []args){
		Random on = new Random();
		int mat[][] = new int[3][3];
		int vet[] = new int[9];
		int i, j, cont=0;

		for(i=0; i<3; i++){
			for(j=0; j<3; j++){
				mat[i][j]=on.nextInt(100);
				vet[cont]=mat[i][j];
				System.out.print(vet[cont] + " ");
				cont++;
			}
		}
	}
}