package q8;

public class Professor extends Funcionario {
    private String titulacao;

    // Construtor

    public Professor() {
    }

    public Professor(String titulacao, int matricula, double salario, String nome, String sobrenome) {
        super(matricula, salario, nome, sobrenome);
        setTitulacao(titulacao);;
    }


    // Getters and Setters
    public String getTitulacao() {
        return this.titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    // Metodos

    @Override
    public double getSalarioPrimeiraParcela(){
        return getSalario();
    }

    @Override
    public double getSalarioSegundaParcela(){
        return 0;
    }
}
