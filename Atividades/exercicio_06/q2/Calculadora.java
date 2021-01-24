public class Calculadora {
    private double operando1;
    private double operando2;

    // Construtor

    public Calculadora() {
    }

    public Calculadora(double operando1, double operando2) {
        this.setOperando1(operando1);
        this.setOperando2(operando2);
    }

    // getters and setters

    public double getOperando1() {
        return this.operando1;
    }

    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    public double getOperando2() {
        return this.operando2;
    }

    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }

    // metodos

    public double soma() {
        return getOperando1() + getOperando2();
    }

    public double sub() {
        return getOperando1() - getOperando2();
    }

    public double div(){
        return getOperando1() / getOperando2();
    }
}
