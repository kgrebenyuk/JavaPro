package HW3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choiceMenu;
        String choiceName;
        int run, swim;

        Animal animals = new Animal();
        Menu menu = new Menu();

        while (true) {
            menu.showMenu1();
            choiceMenu = sc.nextInt();
            if (!menu.isChoiceCorrect(choiceMenu)) continue;
            if (choiceMenu == 0) break;

            choiceName = menu.getName();

            run = menu.getRun(choiceMenu);
            if (!menu.isValidated) continue;

            if (choiceMenu == 1) {
                swim = menu.getSweem();
                if (!menu.isValidated) continue;

                Dog dog = new Dog(choiceName, run, swim);
                dog.run();
                dog.swim();

            } else {
                swim =-1;
                Cat cat = new Cat(choiceName, run);
                cat.run();
            }
            animals.addAnimal(choiceMenu, choiceName, run, (choiceMenu == 1) ? swim : -1);
        }
        animals.getStatistics();
    }
}


