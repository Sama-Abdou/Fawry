abstract class Product {
    protected String name;
    protected double price;
    protected int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void reduceQuantity(int q) {
        quantity -= q;
    }

    // default values
    public boolean isExpired() {
        return false;
    }
    public boolean isShippable() {
        return false;
    }
    public double getWeight() {
        return 0;
    }
}