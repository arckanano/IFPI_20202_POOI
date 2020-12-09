public class TestaEquipamento {

    public static void main(String[] args) {
        
        Equipamento geladeira = new Equipamento();
        Equipamento serra = new Equipamento();

        geladeira.ligado = true;
        serra.ligado = false;

        geladeira.inverte();
        serra.inverte();

        if (geladeira.estaLigado() == true) {
            System.out.println(" Geladeira Esta ligado");
        } else {
            System.out.println("Geladeira Esta desligado");
        }
        if (serra.estaLigado() == true) {
            System.out.println("Serra Esta ligado");
        } else {
            System.out.println("Serra Esta desligado");
        }

    }
    
}
