package hw.tuan6.animal;

public class BigDog extends Dog {

    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Wooow");
    }

    @Override
    public void greets(Dog another) {
        if (another == null) {
            return;
        }
        System.out.println("Woooooow");
    }

    public void greets(BigDog another) {
        if (another == null) {
            return;
        }
        System.out.println("Wooooooooow");
    }
}
