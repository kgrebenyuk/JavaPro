package HW3;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    public boolean isValidated;

    public void showMenu1() {
        System.out.println("\nВведите Тип животного (1/2): ");
        System.out.println(" 1: Собака ");
        System.out.println(" 2: Кошка ");
        System.out.println(" 0: закончить ввод и получить статистику");
    }

    public boolean isChoiceCorrect(int choice) {
        if (choice < 0 || choice > 2) {
            System.out.println("\nВведите корректно (0/1/2) ");
            return false;
        }
        return true;
    }

    public String getName() {
        System.out.print("Введите Имя животного: ");
        return sc.next();
    }

    public int getRun(int choice) {
        System.out.print("Введите пробег: ( до ");
        System.out.print((choice == 1) ? Dog.maxRun : Cat.maxRun + " метров) ");
        System.out.print(" метров) ");
        int run = sc.nextInt();
        if (!Dog.isValidateRun(run)) {
            isValidated = false;
            return -1;
        } else {
            isValidated = true;
            return run;
        }
    }

    public int getSweem() {
        System.out.print("Введите заплыв: ( до " + Dog.maxSwim + " метров)");
        int swim = sc.nextInt();
        if (!Dog.isValidateSwim(swim)) {
            isValidated = false;
            return -1;
        } else {
            isValidated = true;
            return swim;
        }
    }
}
