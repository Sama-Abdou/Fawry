public class Main {
    public static void main(String[] args) {
        Product cheese = new ShippableProduct("Cheese", 100, 5, 0.2);
        Product biscuits = new ExpiredProduct("Biscuits", 150, 3, "2025-07-10");
        Product tv = new ShippableProduct("TV", 300, 3, 5.0);
        Product scratchCard = new Product("Scratch Card", 50, 10) {
            @Override public boolean isExpired() { return false; }
            @Override public boolean isShippable() { return false; }
            @Override public double getWeight() { return 0; }
        };

        Customer customer = new Customer("Sama", 1000);
        Cart cart = new Cart();

        cart.add(cheese, 2);
        cart.add(biscuits, 1);
        cart.add(tv,1);
        cart.add(scratchCard, 1);

        Checkout.checkout(customer, cart);
    }
}