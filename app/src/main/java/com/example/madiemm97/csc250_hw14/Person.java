package com.example.madiemm97.csc250_hw14;

/**
 * Created by madiemm97 on 11/30/2017.
 */

public class Person implements Comparable<Person>
{
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String gender;

    public Person(String firstName, String lastName, int age, String gender)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public int compareTo(Person p)
    {
        //return this.firstName.compareTo(p.firstName);
        //return this.age - p.age;
        if(this.age == p.age)
        {
            return 0;
        }

        else if(this.age < p.age)
        {
            return -1;
        }

        else
        {
            return 1;
        }
    }

    public String toString()
    {
        return this.firstName + " " + this.lastName + " age: " + this.age + " gender: " + this.gender;

    }

}
