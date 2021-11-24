package hw.tuan5.hw1.animal;

public class Dog extends Mammal {

    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        if (another == null) {
            return;
        }
        System.out.println("Woooof");
    }

    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}
