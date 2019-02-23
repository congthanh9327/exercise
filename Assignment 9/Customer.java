import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Customer {
    protected int customerId;
    protected String name;
    protected Date orderDate;
    protected int numberOfKW;
    protected int price;

    public static int LOWER_50_TO_50 = 1000;
    public static int FROM_51_TO_100  =1200;
    public static int FROM_101_TO_200 = 1500;
    public static int HIGHER_200 =  2000;
    public static int FOREIGN =  2000;


    public Customer(int customerId, String name, Date orderDate, int numberOfKW) {
        this.customerId = customerId;
        this.name = name;
        this.orderDate = orderDate;
        this.numberOfKW = numberOfKW;
        calculatePrice();
    }

    public int getPrice() {
        return price;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void show(){
        System.out.println("id: " + customerId);
        System.out.println("name: " + name);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("orderDate: " + simpleDateFormat.format(orderDate));
        System.out.println("numberOfKW: " + numberOfKW);
        System.out.println("price: " + price);
        showExtend();
        System.out.println("*********************************************");
    };

    protected abstract void showExtend();


    public abstract void calculatePrice();

}