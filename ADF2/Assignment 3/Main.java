public class Main {
    public static void main(String[] args) {
        Student std1 = new Student(1,"student1",20);
        Student std2 = new Student(2,"student2",20);
        PersonModel<Student> studentObj = new PersonModel();
        studentObj.insertPerson(std1);
        studentObj.insertPerson(std2);
        studentObj.printPerson();
        System.out.println("============================");
        Employee emp1 = new Employee(1,"employee1",1000);
        Employee emp2 = new Employee(2,"employee2",2000);
        PersonModel<Employee> employeeObj = new PersonModel<>();
        employeeObj.insertPerson(emp1);
        employeeObj.insertPerson(emp2);
        employeeObj.printPerson();

    }
}