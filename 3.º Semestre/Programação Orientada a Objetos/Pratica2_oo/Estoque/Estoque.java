package br.com.estoque;

public class Estoque {
    private int codProd;
    private String nome;
    private int qtdAtual;
    private int qtdMin;

    public Estoque() {
    }

    public Estoque(int codProd, String nome, int qtdAtual, int qtdMin) {
        this.codProd = codProd;
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMin = qtdMin;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public void setQtdMin(int qtdMin) {
        this.qtdMin = qtdMin;
    }

    public int getCodProd() {
        return codProd;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public int getQtdMin() {
        return qtdMin;
    }

    public void darBaixa(int qtd){
        qtdAtual = qtdAtual - qtd;
        if(qtd <= qtdAtual ){
        }
        else {
            System.out.print("Estoque insuficiente para a baixa");
        }
    }

    public String mostra(){
        return "Produto: " + this.nome + "\n" +
                "Quantidade minima :" + this.qtdMin + "\n" +
                "Quantidade atual: " + this.qtdAtual;
    }

    public boolean precisaRepor(){
        if(getQtdAtual() <= getQtdMin()){
            return true;
        }
        else{
            return false;
        }
    }
}
