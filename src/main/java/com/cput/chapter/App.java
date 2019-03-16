package com.cput.chapter;

import java.util.Scanner;


public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        //Encapsulation
        Mammal mammal = new Mammal(4);
        System.out.println(mammal.getDetails());

        press(scan);

        //Inheritance
        Person mikhail  = new Person("Mikhail", "Hathey", 28, 8, 1994, 2);
        System.out.println(mikhail.toString());
        System.out.println(mikhail.getDetails());

        press(scan);

        //Polymorphism
        Carnivore c = mikhail;
        System.out.println(c.diet);

        press(scan);

        //Composition
        Name name = new Name("Riaz", "Hathey");
        DateOfBirth dob = new DateOfBirth(24, 9, 1965);
        PersonComposition riaz = new PersonComposition(name, dob);
        System.out.println(riaz.toString());

    }

    public static void press(Scanner scan)
    {
        System.out.println("\nPress enter to continue\n");
        String y = scan.nextLine();
    }

}
