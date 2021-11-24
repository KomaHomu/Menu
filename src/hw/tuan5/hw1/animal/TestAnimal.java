package hw.tuan5.hw1.animal;

public class TestAnimal {

    public void run() {

        Animal animal = new Animal("Rex");
        System.out.println(animal);

        Animal cat = new Cat("Tom");
        System.out.println(cat);
        ((Cat)cat).greets();

        Animal dog1 = new Dog("Tyke");
        System.out.println(dog1);
        Dog dog2 = new Dog("Mike");
        dog2.greets();
        ((Dog)dog1).greets(dog2);
    }
}
