package Phonebook;

public class Record {
    private String name;
    private String phonNumber;

    public String getName() {
        return name;
    }

    public String getPhonNumber() {
        return phonNumber;
    }

    public Record(String name, String phonNumber) {
        this.name = name;
        this.phonNumber = phonNumber;
    }
}
