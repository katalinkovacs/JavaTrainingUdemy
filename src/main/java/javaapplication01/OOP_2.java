package javaapplication01;

public class OOP_2 {


    public static void main(String[] args) {


        Person person1 = new Person();

        System.out.println(person1.fname);
        System.out.println(person1.lname);

        person1.printName();

        //person1.printName("Sebi", "Kovacs");
        //person1.printName("ZOli", "Kovacs");
        //person1.printName("Kati", "Kovacs");

        Person person2 = new Person("Katalin", "Hada");

        System.out.println(person2.fname);
        System.out.println(person2.lname);

        person1.printName();

    }

}

class Person
{
    String fname;
    String lname;

    Person()
    {
        fname = "John";
        lname = "Doe";

    }

    Person(String firstname, String lastname)
    {
        firstname = fname;
        lastname = lname;

    }

    void printName()
    {
        System.out.println("Name: " + this.fname +  " " + this.lname);
    }


}


