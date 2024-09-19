import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Artigo> artigos = new ArrayList<Artigo>();
        artigos.add(new Artigo("Fítulo do artigo 1", "Resumo do artigo 1", "Autor do artigo 1"));
        artigos.add(new Artigo("Título do artigo 2", "Resumo do artigo 2", "Autor do artigo 2"));
        artigos.add(new Artigo("Título do artigo 3", "Resumo do artigo 3", "Autor do artigo 3"));
        artigos.add(new Artigo("Título do artigo 4", "Resumo do artigo 4", "Autor do artigo 4"));
        artigos.add(new Artigo("Título do artigo 5", "Resumo do artigo 5", "Autor do artigo 5"));
        artigos.add(new Artigo("Título do artigo 6", "Resumo do artigo 6", "Autor do artigo 6"));
        artigos.add(new Artigo("Título do artigo 7", "Resumo do artigo 7", "Autor do artigo 7"));
        artigos.add(new Artigo("Título do artigo 8", "Resumo do artigo 8", "Autor do artigo 8"));
        artigos.add(new Artigo("Título do artigo 9", "Resumo do artigo 9", "Autor do artigo 9"));
        artigos.add(new Artigo("Título do artigo 10", "Resumo do artigo 10", "Autor do artigo 10"));

        Edicao edicao = new Edicao(1, 1, "01/01/2022", 1000);
        for (Artigo artigo : artigos) {
            edicao.adicionaArtigo(artigo);
        }

        RevistaCientifica revista = new RevistaCientifica("Revista de Ciência", 1234567890, "mensal");
        revista.adicionaEdicao(edicao);

        System.out.println("Dados da revista:");
        System.out.println("Título: " + revista.getTitulo());
        System.out.println("ISSN: " + revista.getIssn());
        System.out.println("Periodicidade: " + revista.getPeriodicidade());

        System.out.println("Dados da edição:");
        System.out.println("Número: " + edicao.getNumero());
        System.out.println("Volume: " + edicao.getVolume());
        System.out.println("Data da edição: " + edicao.getDataEdicao());
        System.out.println("Tiragem: " + edicao.getTiragem());
    }
}
