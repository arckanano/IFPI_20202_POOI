import javax.annotation.processing.SupportedSourceVersion;

public class Quadrado implements FiguraGeometrica {

    private int lado = 5;

    public int getLado() {
        return this.lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea(){ 
        return getLado() * 2;
    }

    @Override
    public double calculaPerimetro(){
        return getLado() * 4;
    }
}
