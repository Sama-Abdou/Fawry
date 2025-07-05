public class ShippableProduct extends Product implements ShippedSpecs {
    private double weight;
    private int requestedQuantity;

    public ShippableProduct(String name, double price, int quantity, double weight) {
        super(name, price, quantity);
        this.weight = weight;
    }

    public void setRequestedQuantity(int requestedQuantity) {
        this.requestedQuantity = requestedQuantity;
    }

    @Override
    public boolean isShippable() {
        return true;
    }
    @Override
    public double getWeight() {
        return weight;
    }
    @Override
    public int getRequestedQuantity() {
        return requestedQuantity;
    }
}
