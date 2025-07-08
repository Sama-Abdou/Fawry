public class ShippingService {
    public static void send(Book book, String address) {
        System.out.println("Shipping PaperBook " + book.title + " to " + address);
    }
}
