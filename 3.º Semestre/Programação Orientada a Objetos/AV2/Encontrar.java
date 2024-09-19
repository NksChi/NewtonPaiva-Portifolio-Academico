import java.util.Scanner;

public class Encontrar {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        AchadoPerdido achado = new AchadoPerdido("Celular", "Iphone perdido",
                "foto123.jpg", "Objeto pessoal", "Newton Paiva", "18/04/2023 21:00",
                "Encontrado");

        achado.setFoto("foto123.jpg");
        achado.setLocal_achado("Cantina da Newton, próximo ao bebedouro");
        achado.setData_hora("18/04/2023 21:00");

        System.out.print("Digite o título do item que você procura: ");
        String titulo = a.nextLine();

        System.out.println(achado.buscarTitulo(titulo));
        achado.visualizaDetalhes();
    }
}
