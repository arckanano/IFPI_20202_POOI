public class app {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("maria", 1000.00);

        System.out.println("Saldo da conta: " + cc.getSaldo());
        System.out.println("Tributo Maria: " + cc.calculaTributo());
    }
}
