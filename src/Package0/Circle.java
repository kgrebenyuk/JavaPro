package Package0;

public class Circle implements FigureArea {

    private double radius;
    private final double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getFigureArea() {
        return pi * radius * radius;
    }
}
