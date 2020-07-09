package session6.inheritance.challenge;

public class Vehicle {

    private int wheels;
    private String engine;
    private String color;

    public Vehicle(int wheels, String engine, String color) {
        this.wheels = wheels;
        this.engine = engine;
        this.color = color;
    }

    public void move(int speed) {
        System.out.println("Moving at speed: " + speed);
    }

    public void changeGear(int gear) {
        System.out.println("Gear changed: " + gear);
    }

    public int getWheels() {
        return wheels;
    }

    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }
}
