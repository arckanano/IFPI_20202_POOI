public class Saudacao {
    String texto;
    String destinatario;

    // Método
    public String obterSaudacao() {
        String saida = texto + " " + destinatario;
        return saida;
    }
}
