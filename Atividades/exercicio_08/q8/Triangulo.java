public class Triangulo implements FiguraGeometrica{
    
    private int base = 5;
    private int altura = 15;
    private int ladoA = 20;
    private int ladoB = 20;
    private int ladoC = 10;


    public int getBase() {
        return this.base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLadoA() {
        return this.ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return this.ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return this.ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public double calculaPerimetro(){
        return getLadoA() + getLadoB() + getLadoC();
    }

    @Override
    public double calculaArea(){
        return (getBase() * getAltura()) / 2;
    }
}
