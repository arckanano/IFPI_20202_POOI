public class TestaFuncionarios {
    public static void main(String[] args) {
        Funcionario diretor = new Diretor();
        Funcionario gerente = new Gerente();

        diretor.setSalario(10000);
        gerente.setSalario(5000);

        System.out.println(diretor.getBonificacao() + gerente.getSalario());
        System.out.println(gerente.getBonificacao());
    }    
}
