package com.cput.chapter.ObeyedPrinciples;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

        Person p;

        @Before
        public void setUp()
        {
            p = new Person(1.65, 65, "Mikhail Hathey", "Indian");
        }

        @Test
        public void testDefend() throws Exception {
            assertEquals("Mikhail Hathey started to Block Attacks", p.defend());
        }

        @Test
        public void testMakeNoise() throws Exception {
            assertEquals("Mikhail Hathey began to Shout for help", p.makeNoise());
        }

        @Test
        public void testFlee() throws Exception {
            assertEquals("Mikhail Hathey wanted to Sprint away", p.flee());
        }

        @Test
        public void testGiveBirth() throws Exception {
            assertEquals("A human has a gestation period of approximately 9 months before they give birth", p.giveBirth());
        }

        @Test
        public void testGetName() throws Exception {
            assertEquals("Mikhail Hathey", p.getName());
        }

        @Test
        public void testGetEthnicity() throws Exception {
            assertEquals("Indian", p.getEthnicity());
        }

}
