import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        int id = 0;
        while (true) {
            System.out.println("menu");
            System.out.println("1. Input Order");
            System.out.println("2. Show Order");
            System.out.println("3. Total customer each type");
            System.out.println("4. Average each Foreign customer");
            System.out.println("5. Show order in 01/2019");
            System.out.println("0. Exit");
            int choose = input("your choose");
            switch (choose) {
                case 1:
                    id++;
                    String name = inputString("name");
                    Date date = inputDate("date of order (dd/mm/yyyy)");
                    int numberOfKW = input("number of kw");
                    int type = input("type of customer(1. Vietnam / 2.Foreign)");
                    Customer customer;
                    if (type == 1) {
                        int customerTypeCode = input("Customer type(1.Living / 2.Business / 3.Manufacturing)");
                        // Living is default
                        customerTypeCode = customerTypeCode > 0 && customerTypeCode < 4 ? customerTypeCode : 1;
                        customer = new VietnamCustomer(id, name, date, numberOfKW, customerTypeCode);
                    } else {
                        String nationality = inputString("nationality");
                        customer = new ForeignCustomer(id, name, date, numberOfKW, nationality);
                    }
                    customers.add(customer);
                    break;
                case 2:
                    System.out.println("*****************List customer***************");
                    for (Customer item : customers) {
                        item.show();
                    }
                    break;
                case 3:
                    int count = 0;
                    for (Customer item : customers) {
                        if (item instanceof VietnamCustomer) count++;
                    }
                    System.out.println("Total Vietnam customer: " + count);
                    System.out.println("Total foreign customer: " + (customers.size() - count));
                    break;
                case 4:
                    int total = 0, numberCustomer = 0;
                    for (Customer item : customers) {
                        if (item instanceof ForeignCustomer) {
                            total += item.getPrice();
                            numberCustomer++;
                        }
                    }
                    if (numberCustomer > 0) {
                        System.out.println("Average each Foreign customer: " + total / numberCustomer);
                    } else {
                        System.out.println("Do not exist order of Foreign customer");
                    }
                    break;
                case 5:
                    System.out.println("List customer order in 01/2019");
                    for (Customer item : customers) {
                        if (item.getOrderDate().getMonth() == 0 && item.getOrderDate().getYear() == 119){
                            item.show();
                        }
                    }
                    break;
                case 0:
                    return;
            }
        }
    }

    public static int input(String field) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input " + field + ":");
        while (!scanner.hasNextInt()) {
            System.out.println("input number plz");
            scanner.next();
        }
        return scanner.nextInt();

    }

    public static String inputString(String field) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input " + field + ":");
        return scanner.nextLine();
    }

    public static Date inputDate(String field) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input " + field + ":");
        String date = scanner.nextLine();
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        try {
            return simpleDateFormat.parse(date);
        } catch (ParseException e) {
            System.out.println("Wrong syntax");
            return inputDate(field);
        }
    }


}
