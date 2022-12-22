package Phonebook;

public class Main {
    public static void main(String[] args) {

        PhoneInfo phoneInfo = new PhoneInfo();

        int numTestData = 4;
        String[][] testArray = {{"name1", "123456"}, {"name2", "0123456"}, {"name3", "11123456"}, {"name1", "99123456"}};

        for (int i = 0; i < numTestData; i++) {
            phoneInfo.addRecord(testArray[i][0], testArray[i][1]);
        }

        System.out.println("name = Null, phoneNumber =" + phoneInfo.find("Null"));
        System.out.println("name = Null, phoneNumber =" + phoneInfo.find("name1"));

        System.out.println("");
        System.out.println("name = Null, phoneNumbers =" + phoneInfo.findAll("Null"));
        System.out.println("name = Null, phoneNumbers =" + phoneInfo.findAll("name1"));
    }
}
