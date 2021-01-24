public class Animal{
    private String especie;
    private String nome;



    // constructos
    
    public Animal() {
    }

    public Animal(String nome, String especie) {
        setNome(nome);
        setEspecie(especie);
    }

    // getters and setters

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
