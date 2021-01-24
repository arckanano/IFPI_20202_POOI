public class app {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado();
        Diarista diarista1 = new Diarista();
        Horista horista1 = new Horista();

        System.out.println("Hora do empregado: " + empregado1.getSalario());
        System.out.println("Hora da diarista: " + diarista1.calcularSalario());
        System.out.println("Hora do horista: " + horista1.calcularSalario());

    }
}
