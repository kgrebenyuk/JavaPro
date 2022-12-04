package Package0;

public class Main {
    public static void main(String[] args) {

        Circle circle =new Circle(5);
        Triangle triangle = new Triangle(3,4);
        Sqare sqare =new Sqare(4);

        System.out.println("Площадь окружности с R= 5, S= " + circle.getFigureArea());
        System.out.println("Площадь Треугольника с Высотой = 3, основанием = 4, S= " + triangle.getFigureArea());
        System.out.println("Площадь квадрата со стороной = 4, S= " + sqare.getFigureArea());
     }
}
