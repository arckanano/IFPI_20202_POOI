package q17;

public class TestaCalculadora {
    public static void main(String[] args) {
        Calculadora a = new Calculadora();
        int op1 = 5;
        int op2 = 10;
        double op3 = 20;
        double op4 = 40;

        System.out.println(a.soma(op1, op2));
        System.out.println(a.soma(op3, op4));
    }
}
