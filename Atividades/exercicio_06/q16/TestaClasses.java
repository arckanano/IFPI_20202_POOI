public class TestaClasses {
    public static void main(String[] args) {
        // ClasseA a = new ClasseA();
        // ClasseB b = new ClasseB();
        // ClasseA a2 = new ClasseB(); // ClasseB por extender ClasseA, pode ser convertida na classeA
        // ClasseB a3 = new ClasseA(); // ClasseA não extende ClasseB, retorna erro, pois não pode ser convertida para a ClasseB;
        ClasseA a2 = new ClasseB();

        // b.atributo1=10; // alterando atributo1 da ClasseA para protected, o mesmo fica visível para ClasseB;

        // System.out.println(a2 instanceof ClasseA);
        // System.out.println(a2 instanceof ClasseB);
        // System.out.println(a3 instanceof ClasseA);
        // System.out.println(a3 instanceof ClasseB);
        // System.out.println(b.atributo1);
        // System.out.println(b.atributo1);
        // System.out.println(a2.metodo1());
        System.out.println(a2.metodo1());

        
    }    
}
