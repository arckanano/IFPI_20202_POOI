public class TestaFigura {
    public static void main(String[] args) {
        FiguraGeometrica q1 = new Quadrado(15);
        FiguraGeometrica q2 = new Quadrado(15);

        // Double areaq1 = q1.calculaArea();
        // Double areaq2 = q2.calculaArea();

        // String s1 = areaq1.toString();
        // String s2 = areaq2.toString();

        // System.out.println(s1.equals(s2));

        System.out.println(q1.comparar(q2));

    }
}
