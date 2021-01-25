public class ClasseB extends ClasseA {


    public ClasseB() {
    }


    // public String metodo1(){
    //     return "metodo 1, classe B";
    // }
    public String metodo1(){
        return super.metodo1();
    }

    public String metodo2(){
        return "metodo 2, classe B";
    }
}
