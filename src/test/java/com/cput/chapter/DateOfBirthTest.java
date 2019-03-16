package com.cput.chapter;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DateOfBirthTest {

    DateOfBirth dob;

    @Before
    public void setUp()
    {
        dob = new DateOfBirth(28,8,1994);
    }

    @Test
    public void tesToString() throws Exception {

        assertEquals("28/8/1994", dob.toString());
    }

}