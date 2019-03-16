package com.cput.chapter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    Person mikhail;

    @Before
    public void setUp()
    {
        mikhail  = new Person("Mikhail", "Hathey", 28, 8, 1994);
    }

    @Test
    public void testGetName() throws Exception {

        assertEquals("Mikhail", mikhail.getName());
    }

    @Test
    public void testGetSurname() throws Exception {
        assertEquals("Hathey", mikhail.getSurname());
    }

    @Test
    public void testGetDay() throws Exception {
        assertEquals(28, mikhail.getDay());
    }

    @Test
    public void testGetMonth() throws Exception {
        assertEquals(8, mikhail.getMonth());
    }

    @Test
    public void testGetYear() throws Exception {
        assertEquals( 1994, mikhail.getYear());
    }

    @Test
    public void testToString() throws Exception {
        assertEquals("My name is Mikhail Hathey, my birthday is 28/8/1994", mikhail.toString());
    }

}
