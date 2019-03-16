package com.cput.chapter;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MammalTest {

    Mammal m;

    @Before
    public void setUp()
    {
        m = new Mammal(4);
    }

    @Test
    public void getDetails() throws Exception {
        assertEquals("I am Warm blooded, I have 4 legs", m.getDetails());
    }

}
