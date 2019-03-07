public class Main {

    public static void main(String[] args) {
        Order order = new Order();
        Product product1 = new Product(1, "product 1", 250, 5);
        Product product2 = new Product(2, "product 2", 100, 2);
        Product product3 = new Product(3, "product 3", 400, 0);

        order.addItem(product1);
        order.addItem(product2, 20);
        order.addItem(product3);

        System.out.println("List of product:");
        for (Product item: order.getProductList()) {
            System.out.println(item.getName());
        }
        System.out.println("Total price:");
        System.out.println(order.getTotal());
    }
}
