package session6.inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 10);

        Dog dog = new Dog("Golden Retriever", 1, 58, 2, 4, 1, 20, "Long silky");

        System.out.println("\n/********************/\n");
        dog.eat();
        System.out.println("\n/********************/\n");
        dog.walk();
        System.out.println("\n/********************/\n");
        dog.run();
        System.out.println("\n/********************/\n");

        Fish fish = new Fish("apollo", 10, 2, 2, 2, 1);

        fish.swim(2);
        System.out.println("\n/********************/\n");
        fish.rest();
        System.out.println("\n/********************/\n");

    }
}
