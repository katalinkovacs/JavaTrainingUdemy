package javaapplication01;

public class OOP_1 {

    public static void main(String[] args) {
        /*
            Objects - containers that stores variables and functions thematically
                      connected to each other for easier future usage
            Classes - blueprint for creating instances (copies) of objects

            Properties - features (part of something)
            Methods - functions (describes what a function does)
        */

        Cat cat1 = new Cat();
        System.out.println(cat1.name);
        System.out.println(cat1.colour);

        Cat cat2 = new Cat("Poppy", "Mixed");
        System.out.println(cat2.name);
        System.out.println(cat2.colour);

    }

}

class Cat
{

    String name;
    String colour;

    Cat()
    {
        name = "Bella";
        colour = "white";
        System.out.println("This is default constructor");
    }


    Cat(String name, String colour)
    {
        this.name = name;
        this.colour = colour;
        System.out.println("This is not default constructor");
    }


}