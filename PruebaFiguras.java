public class PruebaFiguras {
    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo();
        rec.base = 5.0;
        rec.altura = 4.0;

        Triangulo tri = new Triangulo();
        tri.base = 6.0;
        tri.altura = 3.0;

        System.out.println("Área del Rectángulo: " + rec.calcularArea());
        System.out.println("Área del Triángulo: " + tri.calcularArea());
    }
}