public class TestaFigura {
    public static void main(String[] args) {
        FiguraGeometrica f1 = new Quadrado();
        f1.setAltura(10);
        f1.setBase(15);
        System.out.println(f1.calculaArea());

        FiguraGeometrica t1 = new Triangulo();
        t1.setAltura(20);
        t1.setBase(10);
        System.out.println(t1.calculaArea());
    }
}
