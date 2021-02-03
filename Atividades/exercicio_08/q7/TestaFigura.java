public class TestaFigura {
    public static void main(String[] args) {
        FiguraGeometrica q1 = new Quadrado();
        System.out.println(q1.calculaArea());
        System.out.println(q1.calculaPerimetro());

        FiguraGeometrica t1 = new Triangulo();
        System.out.println(t1.calculaArea());
        System.out.println(t1.calculaPerimetro());
    }
}
