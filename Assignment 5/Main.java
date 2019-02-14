import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Order order = new Order();
        Shirt shirt = new Shirt(1, "Shirt", 300, 5);
        Ring ring = new Ring(2, "Ring", 900, 5);
        order.addItem(shirt, 2);
        order.addItem(ring, 3);

        System.out.println("----- List of product ordered ------------");
        for (Product item : order.getProductList()) {
            System.out.println("* " + item.getName());
        }
        System.out.println("Total price of order: " + order.getTotal());

        System.out.println("----------- Product available --------------");
        System.out.println("* " + shirt.getName() + ": " + shirt.getQuantity());
        System.out.println("* " + ring.getName() + ": " + ring.getQuantity());


    }
}
