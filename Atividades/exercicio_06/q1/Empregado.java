public class Empregado {
    private double salario = 500;

    // Construtor
    public Empregado(){};

    public Empregado(double salario) {
        this.salario = salario;
    }

    // get e set
    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Metodos
    public double calcularSalario(){
        return getSalario();
    }

}
