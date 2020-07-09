package session6.inheritance.challenge;

public class Car extends Vehicle {

    private String name;
    private int doors;

    public Car(String engine, String color, String name, int doors) {
        super(4, engine, color);
        this.name = name;
        this.doors = doors;
    }

    public String getName() {
        return name;
    }

    public int getDoors() {
        return doors;
    }
}
