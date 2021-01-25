public class ClasseA {
    private int atributo1;
    // protected int atributo1;

    // Construtores
    public ClasseA() {
    }

    public ClasseA(int atributo1){
        setAtributo1(atributo1);
    }


    // Getters and Setters
    public int getAtributo1() {
        return this.atributo1;
    }

    public void setAtributo1(int atributo1) {
        this.atributo1 = atributo1;
    }

    // Metodos
    public String metodo1(){
        return "metodo1, classe A";
    }
}
