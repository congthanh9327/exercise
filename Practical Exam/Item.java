public class Item {
    private int itemId;
    private String name;
    private String producer;
    private double price;

    public Item(int itemId, String name, String producer, double price) {
        this.itemId = itemId;
        this.name = name;
        this.producer = producer;
        this.price = price;
    }

    @Override
    public String toString() {
        return itemId + " " + name + " " + producer + " " + price;
    }
}
