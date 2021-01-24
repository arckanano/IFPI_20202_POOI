package q3;

public class Peixe extends Animal{
    
    private int profundidade;

    // constructors
    public Peixe() {
    }

    public Peixe(int profundidade) {
        setprofundidade(profundidade);
    }

    public Peixe(String especie, int profundidade) {
        super(especie);
        setprofundidade(profundidade);
    }

    // getters and setters
    public int getprofundidade() {
        return this.profundidade;
    }

    public void setprofundidade(int profundidade) {
        this.profundidade = profundidade;
    }

}
