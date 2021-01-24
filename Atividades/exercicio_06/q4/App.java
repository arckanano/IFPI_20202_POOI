public class App {
    public static void main(String[] args) {
        // Animal a = new Bovino();
        Bovino b = new Bovino();
        Peixe p = new Animal();
        // a.setProducaoLeite(5);
        b.setProducaoLeite(5);

        System.out.println(b.getProducaoLeite());
    }
    
}
