import javax.annotation.processing.SupportedSourceVersion;

public class Quadrado implements FiguraGeometrica, Comparavel {

    private int lado;

    public Quadrado(int lado) {
        setLado(lado);
    }

    public int getLado() {
        return this.lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return getLado() * 2;
    }

    @Override
    public double calculaPerimetro() {
        return getLado() * 4;
    }

    @Override
    public int comparar(FiguraGeometrica f) {
        if (this.calculaArea() < fig.calculaArea()) {
            return -1;
        } else if (this.calculaArea() > fig.calculaArea()) {
            return 1;
        }
        return 0;
    }
}
