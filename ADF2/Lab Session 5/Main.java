import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String sqlQuery, choice;
        Scanner scanner = new Scanner(System.in);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/t1806s2";
            String user = "root";
            String pass = "mysql168";

            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement statement = connection.createStatement();
            ResultSet rs;
            int result;
            while (true) {
                System.out.println("STUDENT MANAGEMENT MENU");
                System.out.println("1. View Student List");
                System.out.println("2. Insert Student");
                System.out.println("3. Delete Student");
                System.out.println("0. Exit");
                choice = scanner.nextLine().trim();

                switch (choice) {
                    case "1"://View table student
                        sqlQuery = "SELECT * FROM student";
                        rs = statement.executeQuery(sqlQuery);
                        while (rs.next()) {
                            System.out.println(rs.getInt("id") + "--" + rs.getString("name") + "--" + rs.getInt("age") + "--" + rs.getInt("mark"));

                        }
                        break;
                    case "2"://Insert new student
                        System.out.println("Insert new student: ");
                        System.out.println("name: ");
                        String name = scanner.nextLine().trim();
                        System.out.println("age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("mark: ");
                        int mark = scanner.nextInt();
                        scanner.nextLine();
                        sqlQuery = "INSERT INTO student (name,age,mark) VALUES ('" + name + "'," + age + "," + mark + ")";
                        result = statement.executeUpdate(sqlQuery);
                        if (result == 1) {
                            System.out.println("inserted successful");
                        } else {
                            System.out.println("Failed");
                        }
                        break;
                    case "3"://delete student by ID
                        System.out.println("ID of student to be deleted:");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        sqlQuery = "DELETE FROM student WHERE id =" + id;
                        result = statement.executeUpdate(sqlQuery);
                        if (result == 1) {
                            System.out.println("deleted successful");
                        } else {
                            System.out.println("Failed");
                        }
                        break;
                    case "0":
                        connection.close();
                        return;
                    default:
                        System.out.println("Wrong choice");
                        break;
                }
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

}