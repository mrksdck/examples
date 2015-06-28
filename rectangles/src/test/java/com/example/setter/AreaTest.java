package com.example.setter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Test of setters passed value implementations of com.example.Rectangle
 * Both implementations have same setters, therefore same result is expected
 * inspired by : http://code.tutsplus.com/tutorials/solid-part-3-liskov-substitution-interface-segregation-principles--net-36710
 */
@RunWith(Parameterized.class)
public class AreaTest {


    @Parameterized.Parameters(name = "{index}: subjects of test {0} should yield value {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Rectangle()},
                {new Square()}
        });
    }

    private com.example.Rectangle rectangle;

    public AreaTest(Rectangle classUnderTest) {
        classUnderTest.setHeight(3);
        classUnderTest.setWidth(4);
        this.rectangle = classUnderTest;
    }

    @Test
    public void testAreaRectangle() {
        assertEquals(12, rectangle.getAreaValue());
    }

}