public class Triangulo extends FiguraGeometrica{
    
    @Override
    public double calculaArea(){ 
        return (getAltura() * getBase()) / 2;
    }
}
