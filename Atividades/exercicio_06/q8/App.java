public class App {
    public static void main(String[] args) {
        Professor nProfessor = new Professor("Doutor", 0123, 4000.00, "João", "Neves");

        System.out.println("Nome: " + nProfessor.getNome());
        System.out.println("Sobrenome: " + nProfessor.getSobrenome());
        System.out.println("Salário: " + nProfessor.getSalario());
        System.out.println("Matricula: " + nProfessor.getMatricula());
        System.out.println("Titulação: " + nProfessor.getTitulacao());

    }
}
