import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static void countOccurance(ArrayList<String> stringArrayList, String string) {
        int count = 0;

        for (String item : stringArrayList) {
            System.out.print(item + " ");
            if (Objects.equals(item, string)) count++;
        }
        System.out.println("\nWord : \"" + string + "\" found " + count + " times");
    }

    static ArrayList<String> toList(String[] arrayString) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, arrayString);
        return arrayList;
    }

    static ArrayList<Integer> findUnique(ArrayList<Integer> arrayList) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (Integer item : arrayList)
            if (!integerArrayList.contains(item)) integerArrayList.add(item);
        return integerArrayList;
    }

    static void calcOccurance(ArrayList<String> stringArrayList) {
        int count;
        while (stringArrayList.size() > 0) {
            String str = stringArrayList.get(0);
            count = 0;
            while (stringArrayList.contains(str)) {
                count++;
                stringArrayList.remove(str);
            }
            System.out.println(str + " : " + count);
        }
    }

    static ArrayList<String> findOccurance(ArrayList<String> stringArrayList) {
        ArrayList<String> arrayString = new ArrayList<>();
        int count;
        while (stringArrayList.size() > 0) {
            String str = stringArrayList.get(0);
            count = 0;
            while (stringArrayList.contains(str)) {
                count++;
                stringArrayList.remove(str);
            }
            arrayString.add("name: \"" + str + "\", occurrence: " + count);
        }
        return arrayString;
    }

    public static void main(String[] args) {

        System.out.print("\ncountOccuranc(): ");
        countOccurance(new ArrayList<>(Arrays.asList("One", "Two", "Three", "One", "Two", "Three", "One", "Two", "Three")), "One");

        System.out.println("\ntoList():" + toList(new String[]{"1", "2", "3"}));

        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 1, 2, 3, 1, 2, 3);
        System.out.println("\nfindUnique(): " + findUnique(arrayList));

        ArrayList<String> arrayList1 = new ArrayList<>();
        System.out.println("\n");
        Collections.addAll(arrayList1, "One", "Two", "Three", "Five", "Six", "One", "Two", "Three", "One", "Two", "Three");
        calcOccurance(arrayList1);

        ArrayList<String> arrayList3 = new ArrayList<>();
        Collections.addAll(arrayList3, "One", "Two", "Three", "Five", "Six", "One", "Two", "Three", "One", "Two", "Three");
        System.out.println("\n");
        for (String str : findOccurance(arrayList3)) {
            System.out.println(str);
        }
    }
}