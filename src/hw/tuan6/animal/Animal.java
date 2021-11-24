package hw.tuan6.animal;

public abstract class Animal {

    private final String name;

    protected Animal(String name) {
        this.name = name;
    }

    public abstract void greets();
}
