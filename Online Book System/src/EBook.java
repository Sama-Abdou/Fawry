public class EBook extends Book {
    private String fileType;
    public EBook(String isbn, String title, int year, double price, String fileType) {
        super(isbn, title, year, price);
        this.fileType = fileType;
    }

    @Override
    public boolean inStock(int quantity){
        return true; // always available bec electronic
    }
    @Override
    public double buy(int quantity, String email, String address){
        MailService.send(this, email);
        return price*quantity;
    }
    @Override
    public boolean forSale() {
        return true;
    }
}
