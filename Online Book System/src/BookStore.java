import java.util.*;
public class BookStore {
    private Map<String, Book> inventory = new HashMap<>(); // map between ISBN and Book
    public void add (Book book){
        inventory.put(book.getIsbn(), book);
        System.out.println("Added Book " + book.getTitle());
    }
    public Book remove (String isbn) {
        return inventory.remove(isbn);
    }
    public List<Book> removeOutdatedBooks(int maxYear, int currentYear) {
        List<Book> removed = new ArrayList<>();
        Iterator<Map.Entry<String, Book>> it = inventory.entrySet().iterator();
        while (it.hasNext()) {
            Book book = it.next().getValue();
            if (currentYear - book.getYear() > maxYear) {
                removed.add(book);
                it.remove();
                System.out.println("Removed outdated book " + book.title);
            }
        }
        return removed;
    }
    public double buyBook(String isbn, int quantity, String email, String address) {
        Book book = inventory.get(isbn);
        if (book == null) throw new RuntimeException("Book not found");
        if (!book.forSale()) throw new RuntimeException("Book not for sale");
        if (!book.inStock(quantity)) throw new RuntimeException("Book not available");

        double amount = book.buy(quantity, email, address);
        System.out.println("Bought book " + book.title + " | Amount paid: $" + amount);
        return amount;
    }

}
