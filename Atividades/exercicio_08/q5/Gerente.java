public class Gerente extends Funcionario{
    
    @Override
    public double getBonificacao(){
        return getSalario() + 1000;
    }
}
