package HomeWorkApp;

import java.util.Scanner;

public class HomeWorkApp {
    static void printThreeWords(String threeWords) {
        System.out.println(threeWords);
    }

    static void checkSumSig(int a, int b) {
        if (a + b >= 0)
            System.out.println("Сума позитивна");
        else
            System.out.println("Сума негативна");
    }

    static String printColor(int value) {
        if (value <= 0) {
            return "Червоний";
        } else if (value > 0 && value <= 100) {
            return "Жовтий";
        } else
            return "Зелений";
    }

    static String compareNumbers(int a, int b) {
        if (a >= b)
            return "a >= b";
        else
            return "a < b";
    }

    static boolean compareSum(int a, int b) {
        return a + b > 10 && a + b <= 20;
    }

    static String compareA(int a) {
        if (a >= 0)
            return "a - додатнє";
        else
            return "a -  від’ємне";
    }

    static boolean trueFalse(int a) {
        return a < 0;
    }

    static void printStr(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    static boolean leapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введить 3 цiлих числа: value, a, b");
        int value, a, b, year;

        value = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();

        printThreeWords("Orange \nBanana \nApple " + "\n");
        System.out.println(printColor(value) + "\n");
        System.out.println(compareNumbers(a, b) + "\n");
        System.out.println(compareSum(a, b) + "\n");
        System.out.println(compareA(a) + "\n");
        System.out.println(trueFalse(a) + "\n");
        printStr("Hello :)", a);

        System.out.println("\nВведить рік (наприкдад: 2022)");
        year = sc.nextInt();
        System.out.println(year + " високосний ? : " + leapYear(year));
    }
}
