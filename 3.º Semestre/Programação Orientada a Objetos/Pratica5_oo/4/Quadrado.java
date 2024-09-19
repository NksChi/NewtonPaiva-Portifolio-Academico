public class Quadrado extends PoligonoRegular {
    public Quadrado(int numlados, float tamLados) {
        super(numlados , tamLados);
    }

    public float calcularArea() {
        return getTamLados() * getTamLados();
    }
}
