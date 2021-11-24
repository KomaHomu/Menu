package hw.tuan6.anotheranimal;

public class Dog extends Animal {

    @Override
    public void greeting() {
        System.out.println("Woof!");
    }

    public void greeting(Dog another) {
        if (another == null) {
            return;
        }
        System.out.println("Woooooof!");
    }
}
