package br.com.acai.newton;

public class acai{
    private int tamanho;
    private double valor;
    private boolean maisSorvete;

    public acai(int tamanho, boolean maisSorvete){
        this.tamanho = tamanho;
        this.maisSorvete = maisSorvete;

        switch (tamanho){
            case 300:
                this.valor = 8;
                break;

            case 500:
                this.valor = 10;
                break;

            case 700:
                this.valor = 12;
                break;
        }

        if (maisSorvete){
            this.valor += 2;
        }
    }

    public double calcularValor(){
        return this.valor;
    }
}