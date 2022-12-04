package Package0;

public  class Sqare implements FigureArea {

    private double a;

    public  Sqare(double a) {
        this.a = a;
    }

    @Override
    public double getFigureArea() {
        return a * a;
    }
}
