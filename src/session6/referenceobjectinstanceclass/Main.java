package session6.referenceobjectinstanceclass;

public class Main {
    public static void main(String[] args) {

//        Creating instance of House
        House blue = new House("blue");

//        Passing reference of blue variable to yellow variable
        House yellow = blue;

        System.out.println("\n/********************/\n");

        System.out.println(blue.getColor());
        System.out.println(yellow.getColor());

//        Changing value of yellow will change the value of blue as yellow is referring to blue variable
//        Their physical value will be same
        yellow.setColor("yellow");

        System.out.println("\n/********************/\n");

        System.out.println(blue.getColor());
        System.out.println(yellow.getColor());


//        Creating instance of House
        House green = new House("green");

//        Passing reference of green variable to red variable
        House red = green;

        System.out.println("\n/********************/\n");

        System.out.println(green.getColor());
        System.out.println(red.getColor());

//        Changing value of red will change the value of green as red is referring to green variable
//        Their physical value will be same
        red.setColor("red");

//        Two different objects/instances has been created and created 2 reference
//        Changing the reference will change the value of the its own object/instance and doesnt effect other instances/objects
        System.out.println("\n/********************/\n");

        System.out.println(blue.getColor());
        System.out.println(yellow.getColor());
        System.out.println();
        System.out.println(green.getColor());
        System.out.println(red.getColor());

        System.out.println("\n/********************/\n");


    }
}
