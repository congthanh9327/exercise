import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("Input item information");
        int id = inputInt("id");
        String name = inputString("name");
        String producer = inputString("producer");
        float price = inputFloat("price");
        Item item = new Item(id, name, producer, price);
        System.out.println(item.toString());
    }

    public static String inputString(String field){
        System.out.print("Input " + field + ":");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int inputInt(String field){
        System.out.print("Input " + field + ":");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()){
            System.out.println("input integer plz!");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static float inputFloat(String field){
        System.out.print("Input " + field + ":");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextFloat()){
            System.out.println("input float plz!");
            scanner.next();
        }
        return scanner.nextFloat();
    }
}