package session6.inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 10);

        Dog dog = new Dog("Golden Retriever", 1, 58, 2, 4, 1, 20, "Long silky");

        dog.eat();

    }
}
