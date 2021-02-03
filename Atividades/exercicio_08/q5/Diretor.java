public class Diretor extends Funcionario{
    
    @Override
    public double getBonificacao(){
        return getSalario() * 1.6;
    }
}
