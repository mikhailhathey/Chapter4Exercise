package com.cput.chapter;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class NameTest {

    Name name;

    @Before
    public void setUp()
    {
        name = new Name("Mikhail", "Hathey");
    }

    @Test
    public void tesToString() throws Exception {
        assertEquals("Mikhail Hathey", name.toString());
    }

}
