import java.util.*;
public class Cart {
    List<CartItem> items = new ArrayList<>();

    void add(Product p, int quantuty) {
        if (quantuty <= 0 || quantuty > p.getQuantity()) {
            throw new RuntimeException("Invalid quantity.");
        }
        if (p instanceof ShippableProduct sp) {
            sp.setRequestedQuantity(quantuty);
        }
        items.add(new CartItem(p, quantuty));
    }
    boolean isEmpty() {
        return items.isEmpty();
    }
    void clear() {
        items.clear();
    }
}
