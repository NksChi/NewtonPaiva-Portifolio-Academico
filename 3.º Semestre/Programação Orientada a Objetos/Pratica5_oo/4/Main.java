public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(3,4);
        Quadrado quadrado = new Quadrado(4,4);

        float areaTriangulo = triangulo.calcularArea();
        float areaQuadrado = quadrado.calcularArea();

        System.out.println("Área do Triângulo: " + areaTriangulo + " m²");
        System.out.println("Área do Quadrado: " + areaQuadrado + " m²");
    }
}
