package com.example.madiemm97.csc250_hw14;

import .support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Arrays;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Patient[] persons = new Patient[4];
        persons[0] = new Patient("Madie", "Martens", 20, "female", 125.31);
        persons[1] = new Patient("Luke", "Martens", 16, "male", 13.28);
        persons[2] = new Patient("Brenda", "Martens", 48, "female", 0);
        persons[3] = new Patient("Sean", "Martens", 49, "male", 427);

        //Arrays.sort(persons);
        Arrays.sort(persons);
        this.printArray(persons);

        for(int i = 0; i < persons.length; i++)
        {
            int test = compare(persons[i], persons[i+1]);
            if(test < 0)
            {
                Patient testPerson = persons[i];
                persons[i] = persons[i+1];
                persons[i+1] = testPerson;
            }
        }

    }

    private void printArray(Person[] p)
    {android
        for (int i = 0; i < p.length; i++)
        {
            System.out.println(p[i]);
        }
    }

    public static int compareThem(Patient a, Patient b)
    {
        return a.balance.compareTo(b.balance);
    }
}
