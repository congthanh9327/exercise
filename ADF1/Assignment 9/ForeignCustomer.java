import java.util.Date;

public class ForeignCustomer extends Customer {
    String nationality;

    public ForeignCustomer(int customerId, String name, Date orderDate, int numberOfKW, String nationality) {
        super(customerId, name, orderDate, numberOfKW);
        this.nationality = nationality;
    }

    @Override
    public void calculatePrice() {
        this.price = numberOfKW * Customer.FOREIGN;
    }

    @Override
    protected void showExtend() {
        System.out.println("nationality: " + nationality);
    }
}
