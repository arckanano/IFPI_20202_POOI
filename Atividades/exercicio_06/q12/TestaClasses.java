public class TestaClasses {
    public static void main(String[] args) {
        // ClasseA a = new ClasseA();
        // ClasseB b = new ClasseB();
        ClasseA a2 = new ClasseB();

        // b.atributo1=10; // alterando atributo1 da ClasseA para protected, o mesmo fica visível para ClasseB;

        // System.out.println(b instanceof ClasseA);
        // System.out.println(a instanceof ClasseB);
        // System.out.println(b.atributo1);
        // System.out.println(b.atributo1);
        System.out.println(a2.metodo1());

        
    }    
}
