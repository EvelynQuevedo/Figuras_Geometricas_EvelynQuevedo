
public class Triangulo extends Figuras {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        double res = (base * altura) / 2;
        return res;
    }

    @Override
    public double perimetro() {
        double res = 3 * base;
        return res;
    }

}
