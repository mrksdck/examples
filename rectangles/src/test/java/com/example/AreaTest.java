package com.example;

import com.example.setter.Rectangle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Test which tests the Rectangle Interface with different implementations
 * NOTE: not really clear what this shows, but was a nice exercise for parametrized tests
 */
@RunWith(Parameterized.class)
public class AreaTest {

    private static com.example.constuctor.Rectangle CONSTRUCTOR_RECTANGLE = new com.example.constuctor.Rectangle(2,3);
    private static com.example.constuctor.Rectangle CONSTRUCTOR_SQUARE = new com.example.constuctor.Square(3);
    private static com.example.setter.Rectangle SETTERS_RECTANGLE;
    private static com.example.setter.Rectangle SETTERS_SQUARE;
    static{
        Rectangle settersRectangle = new com.example.setter.Rectangle();
        settersRectangle.setHeight(2);
        settersRectangle.setWidth(3);
        SETTERS_RECTANGLE = settersRectangle;
        Rectangle settersSquare = new com.example.setter.Square();
        settersSquare.setHeight(2);
        settersSquare.setWidth(3);
        SETTERS_SQUARE = settersSquare;
    }

    @Parameterized.Parameters(name = "{index}: subjects of test {0} should yield value {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {CONSTRUCTOR_RECTANGLE, new Integer(6)},
                {CONSTRUCTOR_SQUARE, new Integer(6)},
                {SETTERS_RECTANGLE, new Integer(6)},
                {SETTERS_SQUARE, new Integer(6)}
        });
    }

    private com.example.Rectangle rectangle;
    private Integer expectedValue;

    public AreaTest(com.example.Rectangle classUnderTest, Integer expectedValue){
        this.rectangle = classUnderTest;
        this.expectedValue = expectedValue;
    }

    @Test
    public void testAreaRectangle() {
        assertEquals(expectedValue.intValue(),rectangle.getAreaValue());
    }

}