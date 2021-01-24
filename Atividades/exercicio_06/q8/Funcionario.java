public class Funcionario extends Pessoa{
    private int matricula;
    private double salario;

    // Constructors

    public Funcionario() {
    }

    public Funcionario(int matricula, double salario, String nome, String sobrenome) {
        super(nome, sobrenome);
        setMatricula(matricula);
        setSalario(salario);
    }

    // Getters and Setters
    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        if (!(salario < 0)) {
            this.salario = salario;
        }
    }

    // Metodos
    public double getSalarioPrimeiraParcela(){
        return getSalario() * (60/100);
    }

    public double getSalarioSegundaParcela(){
        return getSalario() * (40/100);
    }
}
