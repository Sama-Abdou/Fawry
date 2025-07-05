import java.util.*;
public class Checkout {
    static void checkout(Customer customer, Cart cart) {
        if (cart.isEmpty()) throw new RuntimeException("Cart is empty.");

        double subtotal = 0;
        double shipping = 0;
        List<ShippedSpecs> toShip = new ArrayList<>();

        for (CartItem it : cart.items) {
            Product p = it.product;
            if (p.isExpired()) throw new RuntimeException(p.getName() + " is expired.");
            if (it.quantity > p.getQuantity()) throw new RuntimeException("Not enough stock for " + p.getName());

            subtotal += it.quantity * p.getPrice();
            if (p instanceof ShippedSpecs) {
                ShippedSpecs shippable = (ShippedSpecs) p;
                shipping += it.quantity * shippable.getWeight() * 10;
                toShip.add(shippable);
            }
        }

        double total = subtotal + shipping;
        customer.checkBalance(total);

        for (CartItem item : cart.items) {
            item.product.reduceQuantity(item.quantity);
        }

        ShippingService.ship(toShip);

        System.out.println("** Checkout receipt **");
        for (CartItem it : cart.items) {
            System.out.printf("%dx %s %.0f\n", it.quantity, it.product.getName(), it.product.getPrice() * it.quantity);
        }
        System.out.println("----------------------");
        System.out.printf("Subtotal %.0f\n", subtotal);
        System.out.printf("Shipping %.0f\n", shipping);
        System.out.printf("Amount %.0f\n", total);
        System.out.printf("Balance left %.0f\n", customer.balance);

        cart.clear();
    }
}
