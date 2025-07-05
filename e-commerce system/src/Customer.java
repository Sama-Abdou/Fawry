public class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void checkBalance(double amount) {
        if (amount > balance) throw new RuntimeException("Insufficient balance.");
        balance -= amount;
    }
}
