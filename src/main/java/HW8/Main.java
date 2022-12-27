package HW8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cat> catArrayList = new ArrayList<>();

        catArrayList.add(new Cat(1, "Bars", 5));
        catArrayList.add(new Cat(2, "Tiger", 7));
        catArrayList.add(new Cat(3, "Tiger", 7));
        catArrayList.add(new Cat(4, "Music", 5));
        catArrayList.add(new Cat(5, "Music", 8));

        if (isEmpy(catArrayList))
            System.out.println("\nList is empty\n");
        else
            System.out.println("\nList is not empty\n");

        System.out.println("Equal names: ");
        printResultList(equalNames(catArrayList));

        System.out.println("Equal ages:  ");
        printResultList(equalAges(catArrayList));

        System.out.println("Equal names and ages: ");
        printResultList(equalNamesAges(catArrayList));
    }

    static void printResultList(ArrayList<Cat> catArrayList) {
        for (Cat cat : catArrayList) {
            System.out.print("N" + cat.getId() + " " + cat.getName() + ", " + cat.getAge());
            if (catArrayList.indexOf(cat) % 2 != 0)
                System.out.println("");
            else
                System.out.print(" : ");
        }
        System.out.println("");
    }


    static boolean isEmpy(List catArrayList) {
        return catArrayList.isEmpty();
    }

    static ArrayList<Cat> equalNames(ArrayList<Cat> catArrayList) {
        ArrayList<Cat> arrayListEqualNames = new ArrayList<>();
        for (Cat cat1 : catArrayList) {
            for (Cat cat2 : catArrayList) {
                if (!cat1.equals(cat2) && cat1.getName().equals(cat2.getName())) {
                    if (!arrayListEqualNames.contains(cat1)) {
                        arrayListEqualNames.add(cat1);
                        arrayListEqualNames.add(cat2);
                    }
                }
            }
        }
        return arrayListEqualNames;
    }

    static ArrayList<Cat> equalAges(ArrayList<Cat> catArrayList) {
        ArrayList<Cat> arrayListEqualNames = new ArrayList<>();
        for (Cat cat1 : catArrayList) {
            for (Cat cat2 : catArrayList) {
                if (!cat1.equals(cat2) && cat1.getAge() == cat2.getAge()) {
                    if (!arrayListEqualNames.contains(cat1)) {
                        arrayListEqualNames.add(cat1);
                        arrayListEqualNames.add(cat2);
                    }
                }
            }
        }
        return arrayListEqualNames;
    }

    static ArrayList<Cat> equalNamesAges(ArrayList<Cat> catArrayList) {
        ArrayList<Cat> arrayListEqualNames = new ArrayList<>();
        for (Cat cat1 : catArrayList) {
            for (Cat cat2 : catArrayList) {
                if (!cat1.equals(cat2) && cat1.getAge() == (cat2.getAge()) && cat1.getName().equals(cat2.getName())) {
                    if (!arrayListEqualNames.contains(cat1)) {
                        arrayListEqualNames.add(cat1);
                        arrayListEqualNames.add(cat2);
                    }
                }
            }
        }
        return arrayListEqualNames;
    }
}
