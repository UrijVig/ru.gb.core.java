package src.main.java.app.model;

public class Order {
    private final Product PRODUCT;
    private final Buyer BUYER;
    private int count;

    public Order(Product PRODUCT, Buyer BUYER, int count) {
        this.PRODUCT = PRODUCT;
        this.BUYER = BUYER;
        this.count = count;
    }

    public Product getPRODUCT() {
        return PRODUCT;
    }

    public Buyer getBUYER() {
        return BUYER;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Order{" +
                "PRODUCT=" + PRODUCT +
                ", BUYER=" + BUYER +
                ", count=" + count +
                '}';
    }
}
