import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook extends Phone {

    private Map phoneList = new HashMap<>();


    @Override
    void insertPhone(String name, String phone) {
        if (!phoneList.containsKey(name)) {
            phoneList.put(name, phone);
            System.out.println("Insert contact success");
        } else if (phoneList.containsKey(name) && !phoneList.get(name).equals(phone)) {
            phoneList.replace(name, phoneList.get(name) + " : " + phone);
        }
    }

    @Override
    void removePhone(String name) {
        if (phoneList.containsKey(name)) {
            phoneList.remove(name);
            System.out.println("Remove contact success");
        } else {
            System.out.println("This contact is not existed");
        }
    }

    @Override
    void updatePhone(String name, String newphone) {
        if (phoneList.containsKey(name)) {
            phoneList.replace(name, newphone);
            System.out.println("Update contact success");
        } else {
            System.out.println("This contact is not existed");
        }
    }

    @Override
    String searchPhone(String name) {
        return phoneList.get(name).toString();
    }

    @Override
    void sort() {
        phoneList = new TreeMap<>(phoneList);
    }

    public Map getPhoneList() {
        return phoneList;
    }
}
