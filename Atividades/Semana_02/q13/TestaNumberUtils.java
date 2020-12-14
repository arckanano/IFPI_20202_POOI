public class TestaNumberUtils {
    public static void main(String[] args) {
        NumberUtils n = new NumberUtils();
        
        n.num = 11;

        System.out.println(n.isPair()); // a
        System.out.println(n.isOdd()); // a.2
        System.out.println(n.isPrime()); // b
        System.out.println(n.printCount();)
        System.out.println(n.printReverseCount();)
        n.printCount();
        n.printReverseCount();
        // System.out.println(n.printCount());
        // System.out.println(n.printReverseCount());
    }
}
