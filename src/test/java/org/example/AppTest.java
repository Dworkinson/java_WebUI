package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    Boolean t = true;
    Boolean f = false;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue(t);
        assertFalse(f);
    }

    @Test
    public void testAssertions() {
        assertEquals(t, t);
    }
}
