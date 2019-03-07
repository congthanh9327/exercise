public class Student {

    private int id;
    private String name;
    private int age;
    private String address;
    private Float gpa;

    public Student(int id, String name, int age, String address, float gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public Float getGpa() {
        return gpa;
    }


    public void show() {
        System.out.println("**********************************");
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("address: " + address);
        System.out.println("gpa: " + gpa);
    }
}
