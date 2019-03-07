import java.util.ArrayList;

public class Order {
    private int id;
    private int total;
    private ArrayList<Product> productList = new ArrayList<>();


    public void addItem(Product item, int quantity) {
        if (quantity < item.getQuantity() && quantity > 0) {
            this.productList.add(item);
            this.total += quantity * item.getPrice();
            item.setQuantity(item.getQuantity() - quantity);
        }
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public int getTotal() {
        return total;
    }
}
