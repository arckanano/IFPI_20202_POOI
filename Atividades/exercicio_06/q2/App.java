public class App {
    public static void main(String[] args) {
        // Instanciar objetos
        Calculadora rSoma = new Calculadora(2, 4);
        Calculadora rDiv = new Calculadora(3, 2);
        CalculadoraCientifica rExpNotRounded = new CalculadoraCientifica(5,5, false);
        CalculadoraCientifica rExpRounded = new CalculadoraCientifica(5.3,5, true);

        System.out.println(rSoma.soma());
        System.out.println(rDiv.div());
        System.out.println(rExpNotRounded.exponenciar());
        System.out.println(rExpRounded.exponenciar());

    }
}
