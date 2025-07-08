public class Main {
    public static void main(String[] args) {

        BookStore store = new BookStore();
        Book paperBook = new PaperBook("Prog1", "Java Basics", 2018, 350, 10);
        Book ebook = new EBook("Prog2", "Python", 2020, 300, "PDF");
        Book showcaseBook = new DemoBook("Story", "Cindrella",  2010, 0.0);

        store.add(paperBook);
        store.add(ebook);
        store.add(showcaseBook);

        store.removeOutdatedBooks(5, 2025); // remove older than 5 years

        store.buyBook("Prog2", 2, "sama@gmail.com", "alexandria");
        store.buyBook("Prog1", 2, "sama@gmail.com", "alexandria"); // will be not found because removed
    }
}