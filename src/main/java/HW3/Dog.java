package HW3;

public class Dog extends  Animal{
    public final static int maxRun = 500;
    public final static int maxSwim = 10;


    public Dog(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;

    }

    public static boolean isValidateRun(int run){
        if (run<0 || run > maxRun) {
            System.out.println("\nВведите пробег корректно: ( до " + Dog.maxRun + " метров) ");
            return false;
        }
        return true;
    }
    public static boolean isValidateSwim(int Swim){
        if (Swim < 0 || Swim > maxSwim)
        {
            System.out.println("\nВведите заплыв корректно: ( до " + Dog.maxSwim + " метров) ");
            return false;
        }
        return true;
    }
    public void run(){
        System.out.println("\nСобака: "+ name + ", " + "пробег " + run + " м." );
    }
    public void swim(){
        System.out.println("\nСобака: "+ name + ", " + "заплыв " + swim + " м." );
    }


}
