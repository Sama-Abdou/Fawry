public class MailService {
    public static void send(Book book, String email) {
        System.out.println("Sending EBook " + book.title + " to " + email);
    }
}
