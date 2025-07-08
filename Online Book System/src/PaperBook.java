public class PaperBook extends Book {
    private int inStockQuantity;
    public PaperBook(String isbn, String title, int year, double price, int inStockQuantity) {
        super(isbn, title, year, price);
        this.inStockQuantity = inStockQuantity;
    }

    @Override
    public boolean inStock(int quantity){
        return inStockQuantity >= quantity;
    }
    @Override
    public double buy(int quantity, String email, String address){
        if (!inStock(quantity))
            throw new RuntimeException("Not available");
        inStockQuantity -= quantity;
        ShippingService.send(this, address);
        return price*quantity;
    }
    @Override
    public boolean forSale() {
        return true;
    }
}
