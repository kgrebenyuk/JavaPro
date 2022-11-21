package HW3;

public class Cat extends Animal {
    public final static int maxRun = 200;

    public Cat(String name, int run) {
        this.name = name;
        this.run = run;
    }

    public static boolean isValidateRun(int run) {
        if(run < 0 || run > maxRun) {
            System.out.println("\nВведите пробег корректно: ( до " + Cat.maxRun + " метров) ");
            return false;
        }
        return true;
    }

    public void run() {
        System.out.println("\nКошка: "+ name + ", " + "пробег " + run + " м.");
    }

}
