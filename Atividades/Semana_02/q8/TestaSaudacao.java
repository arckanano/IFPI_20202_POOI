public class TestaSaudacao {
    public static void main(String[] args) {
        Saudacao s = new Saudacao();
        s.texto = "Bom dia";
        s.destinatario = "Joao";

        System.out.println(s.obterSaudacao());
    }    
}
