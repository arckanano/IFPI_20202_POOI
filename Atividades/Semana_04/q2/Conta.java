public class Conta {
    
    private String conta;
    private int saldo;

    Conta(){}

    Conta(String conta, int saldo){
        setConta(conta);
        setSaldo(saldo);
    }

    public String getConta(){
        return this.conta;
    }

    public void setConta(String conta){
        this.conta = conta;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

    // Fim getters and setters



}
