public class Triangulo extends PoligonoRegular {
    public Triangulo(int numlados, float tamLados) {
        super(numlados, tamLados);
    }

    public float calcularArea() {
        return (getTamLados() * getTamLados()) / 2;
    }
}

