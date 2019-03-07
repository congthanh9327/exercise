import java.util.Map;
import java.util.Scanner;

public class ManagePhoneBook {

    public static void main(String[] args) {
        boolean finishSelect = false;
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);
        String name, phone, actionString;
        while (!finishSelect) {
            System.out.println("PHONEBOOK MANAGEMENT SYSTEM");
            System.out.println("1. Insert Phone");
            System.out.println("2. Remove Phone");
            System.out.println("3. Update Phone");
            System.out.println("4. Search Phone");
            System.out.println("5. Sort");
            System.out.println("6. Print phone book");
            System.out.println("7. Finish program");
            System.out.println("your chose: ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    name = input("name");
                    phone = input("phone");
                    phoneBook.insertPhone(name, phone);
                    System.out.println("Insert contact success");
                    break;
                case 2:
                    actionString = input("name to remove");
                    phoneBook.removePhone(actionString);
                    break;
                case 3:
                    name = input("name");
                    phone = input("phone");
                    phoneBook.updatePhone(name, phone);
                    break;
                case 4:
                    actionString = input("name to search");
                    System.out.println(phoneBook.searchPhone(actionString));
                    break;
                case 5:
                    phoneBook.sort();
                    break;
                case 6:
                    Map phoneList = phoneBook.getPhoneList();
                    if (phoneList.size() > 0) {
                        for (Object key : phoneList.keySet()) {
                            System.out.println(key.toString() + "/" + phoneList.get(key.toString()));
                        }
                    } else {
                        System.out.println("Phone book has no contact");
                    }
                    break;
                case 7:
                    finishSelect = true;
                    break;
                default:
                    break;

            }
        }
    }


    public static String input(String fieldName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input " + fieldName + ": ");
        return scanner.nextLine();
    }
}
