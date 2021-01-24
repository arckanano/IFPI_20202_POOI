public class Bovino extends Animal{

    private float ProducaoLeite;

    // construtor
    public Bovino() {
    }

    public Bovino(float ProducaoLeite) {
        setProducaoLeite(ProducaoLeite);
    }

    public Bovino(String especie, float ProducaoLeite) {
        super(especie);
        setProducaoLeite(ProducaoLeite);
    }

    // getters and setters
    public float getProducaoLeite() {
        return this.ProducaoLeite;
    }

    public void setProducaoLeite(float ProducaoLeite) {
        this.ProducaoLeite = ProducaoLeite;
    }

    
}
