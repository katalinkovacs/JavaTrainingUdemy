package javaapplication01.oop2;

/**
 * Created by Zoli on 17/02/2017.
 */
public class StartMain {


    public static void main(String[] args) {


        // john doe
        Person person1 = new Person();

        System.out.println(person1.getFname());
        System.out.println(person1.getLname());


        person1.printName();



        Person person2 = new Person("Katalin", "Hada");

        System.out.println(person2.getFname());
        System.out.println(person2.getLname());


        person2.printName();



    }

}
