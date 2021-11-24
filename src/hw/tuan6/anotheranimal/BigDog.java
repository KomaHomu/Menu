package hw.tuan6.anotheranimal;

public class BigDog extends Dog {

    @Override
    public void greeting() {
        System.out.println("Woow!");
    }

    @Override
    public void greeting(Dog another) {
        if (another == null) {
            return;
        }
        System.out.println("Woooooow!");
    }

    public void greeting(BigDog another) {
        if (another == null) {
            return;
        }
        System.out.println("Wooooooooow!");
    }
}
