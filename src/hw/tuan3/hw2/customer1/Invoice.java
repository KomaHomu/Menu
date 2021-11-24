package hw.tuan3.hw2.customer1;

public class Invoice {

    private final int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerID() {
        return getCustomer().getId();
    }

    public String getCustomerName() {
        return getCustomer().getName();
    }

    public double getCustomerDiscount() {
        return getCustomer().getDiscount();
    }

    public double getAmountAfterDiscount() {
        return getAmount() * (100 - getCustomerDiscount()) / 100;
    }

    public String toString() {
        return "Invoice[id = " + getId() + ", customer = " + getCustomer() + ", amount = " + getAmount() + "]";
    }
}
