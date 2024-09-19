import java.util.Scanner;
public class E50{
	public static void main(String[] args){
		Scanner on = new Scanner(System.in);
		float preco, total=0;
		int quant;
		String prod="aa";

		while(!"FIM".equals(prod)){
			System.out.println("Entre com o produto deseja :");
			prod=on.nextLine();
		if(!prod.equals("FIM")){
			System.out.println("Entre com o preço do produto: ");
			preco=on.nextFloat();
			System.out.println("Entre com a quantidade desejada: ");
			quant=on.nextInt();

			total=preco*quant;

			System.out.println("O total da compra deu : " + total);

		}
				on = new Scanner(System.in);
		}
	}
}


