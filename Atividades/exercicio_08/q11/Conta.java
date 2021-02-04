public class Conta {
    private String nome;
    private double saldo;


    public Conta() {
    }

    public Conta(String nome, double saldo) {
        setNome(nome);
        setSaldo(saldo);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }    
}
