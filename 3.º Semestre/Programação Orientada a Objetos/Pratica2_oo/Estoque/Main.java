package br.com.estoque;

public class Main {
    public static void main(String[] args) {
        Estoque e = new Estoque();
        e.setNome("caneta");
        e.setQtdAtual(10);
        e.setQtdMin(5);
        System.out.println(e.mostra());

        Estoque e1 = new Estoque(1,"caderno", 28, 1 );
        e1.darBaixa(10);
        System.out.println("Estoque atual: " + e1.getQtdAtual());
        e1.darBaixa(1000);

        System.out.println(e1.precisaRepor());
    }
}
