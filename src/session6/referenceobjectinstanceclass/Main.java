package session6.referenceobjectinstanceclass;

public class Main {
    public static void main(String[] args) {

//        Creating instance of House
        House house = new House("blue");

//        Passing reference of house variable to anotherHouse variable
        House anotherHouse = house;

        System.out.println("\n/********************/\n");

        System.out.println(house.getColor());
        System.out.println(anotherHouse.getColor());

//        Changing value of anotherHouse will change the value of house as anotherHouse is referring to house variable
//        Their physical value will be same
        anotherHouse.setColor("yellow");

        System.out.println("\n/********************/\n");

        System.out.println(house.getColor());
        System.out.println(anotherHouse.getColor());

        System.out.println("\n/********************/\n");

    }
}
