package Horta;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Fruta> frutas;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.frutas = new ArrayList<>();
    }

    public void addFruta(Fruta fruta) {
        frutas.add(fruta);
    }

    public int quantidadeFrutas() {
        return frutas.size();
    }

    public double valorPedido() {
        double valor = 0;
        for (Fruta fruta : frutas) {
            valor += fruta.getPreco();
        }
        return valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Fruta> getFrutas() {
        return frutas;
    }

    public double getValorTotal() {
        double valorTotal = 0.0;
        for (Fruta fruta : frutas) {
            valorTotal += fruta.getPreco();
        }
        return valorTotal;
    }

}
