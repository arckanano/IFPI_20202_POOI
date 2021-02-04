public class AuditoriaInterna implements Tributavel{
    Tributavel[] t = new Tributavel[3];

    public void adicionar(Tributavel c){
        try {
            for (int i = 0; i < this.t.length; i++) {
                if ( t[i] == 0 || t[i] == null) {
                    t[i] = c;
                }
            }
        } catch (Exception e) {
            System.out.println("Fim das contas!");
        }
    }

    @Override
    public double calculaTributo(){
        double totalTributos = 0;
        for (int i = 0; i < t.length; i++) {
            totalTributos += t[i].calculaTributo();
        }
        return totalTributos;
    }
    
}
