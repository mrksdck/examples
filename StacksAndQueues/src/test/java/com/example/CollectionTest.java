package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static org.junit.Assert.*;

/**
 *  a test for subtyping stack/list as collection and using them interchangeable
 */
@RunWith(Parameterized.class)
public class CollectionTest {

    @Parameterized.Parameters(name = "{index}: class of test {0}")
    public static java.util.Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Stack()},
                {new Queue()},
        });
    }

    private String firstItem = "first";
    private String secondItem = "second";
    private Collection collection;

    public CollectionTest(Collection collection) {
        this.collection = collection;
    }

    @Test
    public void testTwoElements() {
        collection.put(firstItem);
        collection.put(secondItem);
        assertEquals(firstItem, (String) collection.get());
    }
}