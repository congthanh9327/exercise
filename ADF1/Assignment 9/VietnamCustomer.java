import java.util.Date;

public class VietnamCustomer extends Customer {

    CustomerType customerType;

    public VietnamCustomer(int customerId, String name, Date orderDate, int numberOfKW, int customerTypeCode) {
        super(customerId, name, orderDate, numberOfKW);
        this.customerType = CustomerType.getCustomerTypeByCode(customerTypeCode);
    }


    @Override
    public void calculatePrice() {
        if (numberOfKW <= 50) {
            price = numberOfKW * Customer.LOWER_50_TO_50;
        } else if (numberOfKW > 50 && numberOfKW <= 100) {
            price = 50 * Customer.LOWER_50_TO_50 + (numberOfKW - 50) * Customer.FROM_51_TO_100;
        } else if (numberOfKW > 100 && numberOfKW <= 200) {
            price = 50 * Customer.LOWER_50_TO_50 + 50 * Customer.FROM_51_TO_100 + (numberOfKW - 100) * Customer.FROM_101_TO_200;
        } else {
            price = 50 * Customer.LOWER_50_TO_50 + 50 * Customer.FROM_51_TO_100 + 100 * Customer.FROM_101_TO_200 + (numberOfKW - 200) * Customer.HIGHER_200;
        }
    }

    @Override
    protected void showExtend() {
        System.out.println("Customer type: " +  customerType.getName());
    }
}
