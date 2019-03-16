package com.cput.chapter;

//Encapsulation

public class Person extends Mammal implements Carnivore {

    private String name;
    private String surname;
    private int day;
    private int month;
    private int year;

    Person()
    {

    }

    Person(String name, String surname, int day, int month, int year)
    {
        this.name = name;
        this.surname = surname;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    Person(String name, String surname, int day, int month, int year, int noOfLegs)
    {
        this.name = name;
        this.surname = surname;
        this.day = day;
        this.month = month;
        this.year = year;
        this.noOfLegs = noOfLegs;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String toString()
    {
        return String.format("My name is %s %s, my birthday is %d/%d/%d", name, surname, day, month, year);
    }
}
