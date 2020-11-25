package com.example.a1ex;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void min1_isCorrect() {
        MainActivity m = new MainActivity();
        assertEquals(m.min(7,10), 7);
    }
    @Test
    public void min2_isCorrect() {
        MainActivity m = new MainActivity();
        assertEquals(m.min(1,15), 1);
    }
    @Test
    public void min3_isCorrect() {
        MainActivity m = new MainActivity();
        assertEquals(m.min(15,10), 10);
    }
    @Test
    public void min4_isCorrect() {
        MainActivity m = new MainActivity();
        assertEquals(m.min(3,2),2);
    }
    @Test
    public void max1_isCorrect() {
        MainActivity m = new MainActivity();
        assertEquals(m.max(3,2),3);
    }
    @Test
    public void max2_isCorrect() {
        MainActivity m = new MainActivity();
        assertEquals(m.max(77,2),77);
    }
    @Test
    public void max3_isCorrect() {
        MainActivity m = new MainActivity();
        assertEquals(m.max(1,3),3);
    }
    @Test
    public void max4_isCorrect() {
        MainActivity m = new MainActivity();
        assertEquals(m.max(28,17),28);
    }
}