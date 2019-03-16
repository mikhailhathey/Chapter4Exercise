package com.cput.chapter;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonCompositionTest {

    Name name;
    DateOfBirth dob;
    PersonComposition john;

    @Before
    public void setUp()
    {
        name = new Name("John", "Samuels");
        dob = new DateOfBirth(15, 4, 1999);
        john = new PersonComposition(name, dob);
    }

    @Test
    public void testToString()
    {
        assertEquals("My name is John Samuels, my birthday is 15/4/1999", john.toString());
    }

}
