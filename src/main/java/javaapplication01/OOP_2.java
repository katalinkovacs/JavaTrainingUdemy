package javaapplication01;

public class OOP_2 {


    public static void main(String[] args) {


        Person person1 = new Person();

        System.out.println(person1.fname);
        System.out.println(person1.lname);

        //System.out.println(person1.printName());

        person1.printName("Sebi", "Kovacs");
        person1.printName("ZOli", "Kovacs");
        person1.printName("Kati", "Kovacs");

        Person person2 = new Person("Katalin", "Hada");

        System.out.println(person2.fname);
        System.out.println(person2.lname);




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

    Person(String fname, String lname)
    {
        this.fname = fname;
        this.lname = lname;

    }

    void printName(String firstname, String lastname)
    {
        System.out.println("Name: " + fname +  " " +lname);
        //System.out.println("Surname " + lname);
    }


}


