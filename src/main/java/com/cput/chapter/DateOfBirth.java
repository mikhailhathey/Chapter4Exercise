package com.cput.chapter;

public class DateOfBirth {

    private int day;
    private int month;
    private int year;

    DateOfBirth()
    {

    }

    DateOfBirth(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString()
    {
        return String.format("%d/%d/%d", day, month, year);
    }

}
