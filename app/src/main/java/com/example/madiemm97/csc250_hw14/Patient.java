package com.example.madiemm97.csc250_hw14;

/**
 * Created by madiemm97 on 11/30/2017.
 */

public class Patient extends Person
{
    private double balance;
    public Patient(String firstName, String lastName, int age, String gender, double balance)
    {
        super(firstName, lastName, age, gender); //MUST be the first line in this constructor
        this.balance = balance;
    }

    public String toString()
    {
        return String.format("%s Balance: %f", super.toString(), this.balance);
    }

    public int sort(Person p)
    {
        for(int i = 0; i < p.length; i++)
        {

        }
    }
}
