import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList();
        int count = 0;
        boolean loop = true;
        int id;
        String name;
        int age;
        String address;
        float gpa;
        Student student;
        while (loop) {
            System.out.println("********************************");
            System.out.println("menu");
            System.out.println("1. Add student. ");
            System.out.println("2. Edit student by id.");
            System.out.println(" 3. Delete student by id. ");
            System.out.println("4. Sort student by gpa. ");
            System.out.println("5. Sort student by name. ");
            System.out.println("6. Show student. ");
            System.out.println("7. Exit. ");
            int choose = input("your choose");
            switch (choose) {
                case 1:
                    count++;
                    name = inputString("name");
                    age = input("age");
                    address = inputString("address");
                    gpa = inputFloat("gpa");
                    student = new Student(count, name, age, address, gpa);
                    studentList.add(student);
                    System.out.println("add success");
                    break;
                case 2:
                    id = input("id");
                    name = inputString("name");
                    age = input("age");
                    address = inputString("address");
                    gpa = inputFloat("gpa");
                    for (Student item: studentList) {
                        if(item.getId() == id){
                            item.setName(name);
                            item.setAge(age);
                            item.setAddress(address);
                            item.setGpa(gpa);
                            System.out.println("edit success");
                        }
                    }
                    break;
                case 3:
                    id = input("id");
                    int index = -1;
                    for (int i = 0; i < studentList.size(); i++) {
                        if(studentList.get(i).getId() == id){
                            index = i;
                        }
                    }
                    if (index != -1){
                        studentList.remove(index);
                        System.out.println("delete success");
                    }
                    break;
                case 4:
                    Collections.sort(studentList, (o1, o2) -> o1.getGpa().compareTo(o2.getGpa()));
                    System.out.println("sort by GPA success");
                    break;
                case 5:
                    Collections.sort(studentList, (o1, o2) -> o1.getName().compareTo(o2.getName()));
                    System.out.println("sort by Name success");
                    break;
                case 6:
                    for (Student item : studentList) {
                        item.show();
                    }
                    break;
                case 7:
                    loop = false;
                    break;
            }
        }
    }

    public static int input(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input " + str);
        int input = 0;
        while (!scanner.hasNextInt()) {
            System.out.println("That's not a number!");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static float inputFloat(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input " + str);
        int input = 0;
        while (!scanner.hasNextFloat()) {
            System.out.println("That's not a number!");
            scanner.next();
        }
        return scanner.nextFloat();
    }

    public static String inputString(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input " + str);
        return scanner.nextLine();
    }
}
