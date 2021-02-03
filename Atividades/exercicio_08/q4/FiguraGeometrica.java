public abstract class FiguraGeometrica{
    private int altura;
    private int base;


    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return this.base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    
    public double calculaArea(){
        return getAltura() * getBase();
    };
}