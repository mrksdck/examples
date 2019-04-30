package com.example.constuctor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Test of constructor passed value implementations of com.example.Rectangle
 * where based on used values in constructor test results are expected
 */
@RunWith(Parameterized.class)
public class AreaTest {

    @Parameters(name = "{index}: subjects of test {0} should yield value {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Rectangle(2, 3), new Integer(6)},
                {new Square(2), new Integer(4)}
        });
    }

    private final com.example.Rectangle rectangle;
    private final Integer valueOfArea;


    public AreaTest(Rectangle rectangle, Integer valueOfArea) {
        this.rectangle = rectangle;
        this.valueOfArea = valueOfArea;
    }

    @Test
    public void testAreaRectangle() {
        assertEquals(valueOfArea.intValue(), rectangle.getAreaValue());
    }

}