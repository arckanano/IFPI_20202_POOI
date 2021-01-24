public class App {
    public static void main(String[] args) {
        Animal[] animais = new Animal[7];

        Animal animalA = new Animal("cachorro", "cão");
        Animal animalB = new Animal("gato", "felino");
        Peixe peixeA = new Peixe("Atum", 500);
        Peixe peixeB = new Peixe("Salmão", 1000);
        Bovino boiA = new Bovino("Nelore", 20.0);
        Bovino boiB = new Bovino("Grande", 30.0);
        Bovino boiC = new Bovino("Pequeno", 10.0);


        animais[0] = animalA;
        animais[1] = animalB;
        animais[2] = peixeA;
        animais[3] = peixeB;
        animais[4] = boiA;
        animais[5] = boiB;
        animais[6] = boiC;

        System.out.println(animais[0]);
    }
    
}
