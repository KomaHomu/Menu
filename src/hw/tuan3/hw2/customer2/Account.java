package hw.tuan3.hw2.customer2;

public class Account {

    private final int id;
    private final Customer customer;
    private double balance;

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        balance = 0;
    }

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return getCustomer().getName();
    }

    public Account deposit(double amount) {
        setBalance(getBalance() + amount);

        return this;
    }

    public Account withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }

        return this;
    }

    public String toString() {
        return getCustomer() + " balance = $" + Math.round(getBalance() * 100.00) / 100.00;
    }
}
