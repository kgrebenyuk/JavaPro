package Phonebook;

import java.util.ArrayList;

public class PhoneInfo {
    ArrayList<Record> recordArrayList = new ArrayList<>();

    public void addRecord(String strName, String strNumber) {
        recordArrayList.add(new Record(strName, strNumber));
    }

    public String find(String name) {
        for (Record record : recordArrayList) {
            if (record.getName().equals(name))
                return record.getPhonNumber();
        }
        return null;
    }

    public ArrayList<String> findAll(String name) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (Record record : recordArrayList) {
            if (record.getName().equals(name))
                stringArrayList.add(record.getPhonNumber());
        }
        return stringArrayList;
    }

    public ArrayList<Record> getRecordArrayList() {
        return recordArrayList;
    }
}
