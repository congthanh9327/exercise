import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<News> arrayList = new ArrayList();
        boolean loop = true;
        while (loop) {
            System.out.println("menu");
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            int choose = inputInt("your choose");
            switch (choose) {
                case 1:
                    String title = input("title");
                    String publishDate = input("publish date");
                    String author = input("author");
                    String content = input("content");
                    News news = new News(title, publishDate, author, content);
                    int[] rateList = news.getRateList();
                    rateList[0] = inputInt("rate 1");
                    rateList[1] = inputInt("rate 2");
                    rateList[2] = inputInt("rate 3");
                    arrayList.add(news);
                    break;
                case 2:
                    System.out.println("*********************************");
                    for (News item : arrayList) {
                        item.display();
                    }
                    System.out.println("*********************************");
                    break;
                case 3:
                    System.out.println("*********************************");
                    for (News item : arrayList) {
                        item.calculate();
                        item.display();
                    }
                    System.out.println("*********************************");
                    break;
                case 4:
                    loop = false;
                    break;
            }
        }
    }

    public static int inputInt(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input " + str);
        int input = 0;
        while (!scanner.hasNextInt()) {
            System.out.println("That's not a number!");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static String input(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input " + str);
        return scanner.nextLine();
    }

}
