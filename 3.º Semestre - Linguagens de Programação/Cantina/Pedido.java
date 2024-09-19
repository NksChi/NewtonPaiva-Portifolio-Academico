import java.util.ArrayList;

public class Pedido {
    private Massa massa;
    private Cliente cliente;
    private ArrayList<Ingrediente> ingredientes;

    public Pedido(Massa massa, Cliente cliente, ArrayList<Ingrediente> ingredientes) {
        this.massa = massa;
        this.cliente = cliente;
        this.ingredientes = ingredientes;
    }

    public double calcularValor() {
        double valor = massa.getValor();
        valor += ingredientes.size() * 2.0;
        return valor;
    }

    public Massa getMassa() {
        return massa;
    }

    public void setMassa(Massa massa) {
        this.massa = massa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
