public class Pessoa {
    private String nome;
    private String sobrenome;

    // Construtores
    public Pessoa() {
    }

    public Pessoa(String nome, String sobrenome) {
        setNome(nome);
        setSobrenome(sobrenome);
    }

    // Getters and Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    // Metodos
    public String getNomeCompleto() {
        return "{" + " nome='" + getNome() + "'" + ", sobrenome='" + getSobrenome() + "'" + "}";
    }

}
