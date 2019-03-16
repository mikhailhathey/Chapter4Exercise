package com.cput.chapter.ObeyedPrinciples;

public class Person extends Mammal implements Fight, Flight, Fright{

    private String defense = "Block Attacks";
    private String cry = "Shout";
    private String movement = "Sprint";

    private String name;
    private String ethnicity;

    Person(double height, double weight, String name, String ethnicity)
    {
        this.setHeight(height);
        this.setWeight(weight);

        this.name = name;
        this.ethnicity = ethnicity;
    }

    public String defend()
    {
        return (name + " started to " + defense);
    }

    public String makeNoise()
    {
        return (name + " began to " + cry + " for help");
    }

    public String flee()
    {
        return (name + " wanted to " + movement + " away");
    }

    public String giveBirth()
    {
        return ("A human has a gestation period of approximately 9 months before they give birth");
    }

    public String getName()
    {
        return name;
    }

    public String getEthnicity()
    {
        return ethnicity;
    }

}
