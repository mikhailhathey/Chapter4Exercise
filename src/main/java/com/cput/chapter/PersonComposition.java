package com.cput.chapter;

//Composition

public class PersonComposition {

    private Name name;
    private DateOfBirth dob;

    PersonComposition()
    {

    }

    PersonComposition(Name name, DateOfBirth dob)
    {
        this.name = name;
        this.dob = dob;
    }

    public String toString()
    {
        return ("My name is " + name.toString() +", my birthday is " + dob.toString());
    }

}