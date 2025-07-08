public abstract class Book {
    protected String isbn;
    protected String title;
    protected int year;
    protected double price;

    public Book(String isbn, String title, int year, double price) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.price = price;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    public double getPrice() {
        return price;
    }

    public abstract boolean inStock(int quantity); //for paper book
    public abstract double buy(int quantity, String email, String address); // for paper and electronic books
    public abstract boolean forSale(); // for demo book

}
