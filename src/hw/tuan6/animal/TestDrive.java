package hw.tuan6.animal;

public class TestDrive {

    public void run() {

        Animal cat = new Cat("Tom");
        cat.greets();

        Animal dog1 = new Dog("Tyke");
        Dog dog2 = new Dog("Mike");
        dog1.greets();
        Dog dog3 = (Dog) dog1;
        dog3.greets(dog2);

        BigDog dog4 = new BigDog("Hachiko");
        BigDog dog5 = new BigDog("Spike");
        dog4.greets();
        dog4.greets(dog3);
        dog4.greets(dog5);
    }
}
