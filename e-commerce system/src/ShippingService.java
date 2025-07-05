import java.util.*;
public class ShippingService { // no need to create an instance of ShippingService
    static void ship(List<ShippedSpecs> items) {
        double totalWeight = 0;
        System.out.println("** Shipment notice **");
        for (ShippedSpecs it : items) {
            int qty = it.getRequestedQuantity();
            double itemWeight = it.getWeight() * qty;
            totalWeight += itemWeight;
            System.out.printf("%dx %s %.0fg\n", qty, it.getName(), itemWeight * 1000);
        }
        System.out.printf("Total package weight %.1fkg\n\n", totalWeight);
    }
}
