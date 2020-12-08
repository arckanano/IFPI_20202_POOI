package q13;

public class TestaNumerUtils {
    public static void main(String[] args) {
        NumberUtils n = new NumberUtils();
        n.n = 7;

        System.out.println(n.isPair());
        System.out.println(n.isOdd());
        System.out.println(n.isPrime());
        System.out.println(n.printCount());
        System.out.println(n.printReverseCount());
    }
}
