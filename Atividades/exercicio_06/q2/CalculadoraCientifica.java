import java.lang.Math;
import java.text.DecimalFormat;

public class CalculadoraCientifica  extends Calculadora{

    boolean arredonda = false;
    // DecimalFormat df = new DecimalFormat("0.0");

    public CalculadoraCientifica() {
    }

    public CalculadoraCientifica(double base, double expoente) {
        super(base, expoente);
    }

    public CalculadoraCientifica(double base, double expoente, boolean arredonda) {
        super(base, expoente);
        this.setArredonda(arredonda);
    }

    public boolean getArredonda() {
        return this.arredonda;
    }

    public void setArredonda(boolean arredonda) {
        this.arredonda = arredonda;
    }
    
    // métodos
    public double exponenciar(){
        double r = Math.pow(super.getOperando1(), super.getOperando2());
        if (getArredonda() == true){

            return Math.round(r);
        }
        return r;
    }

}
