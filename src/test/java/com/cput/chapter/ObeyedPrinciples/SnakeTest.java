package com.cput.chapter.ObeyedPrinciples;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SnakeTest {

    Snake viper;

    @Before
    public void setUp()
    {
        viper = new Snake(0.10, 2);
    }

    @Test
    public void testDefend() throws Exception {
        assertEquals("The snake tried to Bite",  viper.defend());
    }

    @Test
    public void testMakeNoise() throws Exception {
        assertEquals("The snake let out a Hiss", viper.makeNoise());
    }

    @Test
    public void testFlee() throws Exception {
        assertEquals("The snake began to Slither away", viper.flee());
    }

    @Test
    public void testLayEggs() throws Exception {
        assertEquals("A snake can lay more than 7 eggs at a time", viper.layEggs());
    }

}
