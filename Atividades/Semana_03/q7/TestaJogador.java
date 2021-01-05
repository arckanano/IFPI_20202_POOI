public class TestaJogador {
    public static void main(String[] args) {
        Jogador j1 = new Jogador(3, 7, 100);
        Jogador j2 = new Jogador(4, 10, 100);

        System.out.println("\nDados dos jogadores:");
        System.out.println("\nJogador 1:");
        System.out.println("Força: " + j1.forca);
        System.out.println("Nivel: " + j1.nivel);
        System.out.println("Pontos Atuais: " + j1.pontosAtuais);

        System.out.println("\nJogador 2:");
        System.out.println("Força: " + j2.forca);
        System.out.println("Nivel: " + j2.nivel);
        System.out.println("Pontos Atuais: " + j2.pontosAtuais);
        
        // Passar quem vai receber o ataque
        j1.atacar(j2);

        System.out.println("\n>>>>>Ataque realizado<<<<<");
        System.out.println("\nPontos restantes:");
        System.out.println("\nJogador 1\nPontos Atuais: " + j1.pontosAtuais);
        System.out.println("\nJogador 2\nPontos Atauis: " + j2.pontosAtuais);



        
    }

}
