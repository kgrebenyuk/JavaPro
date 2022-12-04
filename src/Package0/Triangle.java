package Package0;

public class Triangle implements FigureArea {

    private double a,b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getFigureArea() {
        return a*b/2;
    }
}
