public class DemoBook extends Book {
    public DemoBook(String isbn, String title, int year, double price) {
        super(isbn, title, year, price);
    }

    @Override
    public boolean inStock(int quantity){
        return false;
    }
    @Override
    public double buy(int quantity, String email, String address){
        throw new RuntimeException("Can not be purchased");
    }
    @Override
    public boolean forSale() {
        return false;
    }
}
