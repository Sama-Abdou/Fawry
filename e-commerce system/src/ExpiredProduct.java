import java.time.LocalDate;
public class ExpiredProduct extends Product {
    private LocalDate expiredDate;

    public ExpiredProduct(String name, double price, int quantity, String expiryDateStr) {
        super(name, price, quantity);
        this.expiredDate = LocalDate.parse(expiryDateStr);
    }

    @Override
    public boolean isExpired() {
        return LocalDate.now().isAfter(expiredDate); // return true if the expired date after the date of today
    }
}
