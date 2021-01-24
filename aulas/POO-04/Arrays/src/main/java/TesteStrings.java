
public class TesteStrings {

    public static void main(String[] args) {
        String s = "Instituto Federal do Piaui";

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.charAt(2));
        System.out.println(s.length());
        System.out.println(s.substring(5));
        System.out.println(s.substring(0, 4));

        
        String[] stringDividida = "Instituto Federal do Piaui".split(" ");
        System.out.println(stringDividida[0]
                + "-"
                + stringDividida[1]
                + stringDividida[2]);

        System.out.println("-" + "   a   ".trim() + "-");
    }
}
