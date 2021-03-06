package hw.tuan3.hw2.customer1;

public class Customer {

    private final int id;
    private final String name;
    private int discount;

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String toString() {
        return getName() + "(" + getId() + ")(" + getDiscount() + "%)";
    }
}
