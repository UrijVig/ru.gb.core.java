package src.main.java.app.model;

public class Product {
    private final String NAME;
    private double price;

    public Product(String name, double price) {
        this.NAME = name;
        this.price = price;
    }

    public String getNAME() {
        return NAME;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "NAME='" + NAME + '\'' +
                ", price=" + price +
                '}';
    }
}
