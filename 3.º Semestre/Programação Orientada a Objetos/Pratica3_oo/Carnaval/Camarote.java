public class Camarote extends Ingresso {
    private String localizacao;
    private double valorAdicional;

    public Camarote(double valor, String localizacao, double valorAdicional) {
        super(valor);
        this.localizacao = localizacao;
        this.valorAdicional = valorAdicional;
    }

    public double getValor() {
        return super.getValor() + this.valorAdicional;
    }

    public String getLocalizacao() {
        return this.localizacao;
    }

    public void imprimeValor() {
        System.out.println("Ingresso Camarote - Valor: R$" + getValor() + " - Localização: " + getLocalizacao());
    }
}
