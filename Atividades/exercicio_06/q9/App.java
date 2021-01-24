public class App {
    public static void main(String[] args) {
        Professor nProfessor = new Professor("Doutor", 0123, 4000.00, "João", "Neves");
        Funcionario nFun = new Funcionario(10001, 3000.00, "Jose", "Silva");

        System.out.println("Nome: " + nProfessor.getNome());
        System.out.println("Sobrenome: " + nProfessor.getSobrenome());
        System.out.println("Salário: " + nProfessor.getSalario());
        System.out.println("Matricula: " + nProfessor.getMatricula());
        System.out.println("Titulação: " + nProfessor.getTitulacao());
        System.out.println();
        System.out.println("Nome: " + nFun.getNome());
        System.out.println("Sobrenome: " + nFun.getSobrenome());
        System.out.println("Salário: " + nFun.getSalario());
        System.out.println("Matricula: " + nFun.getMatricula());


    }
}
