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
	public int comparar(FiguraGeometrica q) {
		return q.comparar(this);
	}

	// public int comparar(Quadrado quadrado) {
	//     if (quadrado.calculaArea() == calculaArea()){
	//         return 0;
	//     } return 1;
	// }
}
