package javaapplication01.oop2;

/**
 * Created by Zoli on 17/02/2017.
 */
public class Person {

    public String getFname() {
        return fname;
    }

    private String fname;

    public String getLname() {
        return lname;
    }

    private String lname;

    Person()
    {
        this.fname = "John";
        this.lname = "Doe";

    }

    Person(String fname, String lname)
    {
        this.fname = fname;
        this.lname = lname;

    }

    void printName()
    {
        System.out.println("Name: " + this.fname +  " " + this.lname);

    }

}
