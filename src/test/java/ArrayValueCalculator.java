import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ArrayValueCalculator {
    private boolean errFlag = false;

    private int doCalc(String[][] arrayStr) throws ArraySizeException {
       if (arrayStr.length != 2 || arrayStr[0].length != 2) {
            throw new ArraySizeException();
        }
        int sumArray = 0;
        int i = 0, j = 0;

        try {
            for (i = 0; i < 2; i++) {
                for (j = 0; j < 2; j++) {
                    sumArray += parseInt(arrayStr[i][j]);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());

            System.out.println("Ошибка в arrayStr[" + i + "][" + j + "] : " + arrayStr[i][j]);
            errFlag = true;
        }
        return sumArray;
    }

    public static void main(String[] args) {
        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();
        int sumArr = 0;

        //// Тестовые матрицы
         //String[][] arrayStr = {{"1", "2"}, {"3", "4"}};
       // String[][] arrayStr = {{"1", "2"}, {"X", "4"}};
         String[][] arrayStr = {{"1", "2","3"}, {"3", "4","6"}};

        try {
            sumArr = arrayValueCalculator.doCalc(arrayStr);
        } catch (ArraySizeException e) {
            System.out.println(e.toString());
            System.out.println("Размер матрицы не  [2] * [2]");
            return;
        } catch (Throwable e){
            System.out.println(e.toString());
            System.out.println("Что-то пошло не так :)");
            return;
        }

        if (!arrayValueCalculator.errFlag)
            System.out.println("Сумма элементов матрицы = " + sumArr);
    }
}