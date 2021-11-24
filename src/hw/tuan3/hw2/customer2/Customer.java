package hw.tuan3.hw2.customer2;

public class Customer {

    private final int id;
    private final String name;
    private final char gender;

    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return getName() + "(" + getId() + ")";
    }
}
