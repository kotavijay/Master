package session6.inheritance.challenge;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("V10", "balck", "audi r8", 2);

        System.out.println(car.getName());
        car.changeGear(3);
        car.move(100);
    }
}
