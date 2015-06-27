package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Test substitution with subtype
 *
 */
@RunWith(Parameterized.class)
public class LinkedListTest {

    private LinkedList linkedList = new LinkedList();
    private OneLinkNode one;
    private OneLinkNode two;

    @Parameters(name = "{index}: subjects of test {0} {1} ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new OneLinkNode("one"), new OneLinkNode("two")}, {new TwoLinkNode("one"), new TwoLinkNode("two")}
        });
    }

    public LinkedListTest(OneLinkNode one, OneLinkNode two) {
        this.one = one;
        this.two = two;
    }

    @Test
    public void emptyList() {
        assertTrue(linkedList.isEmpty());
    }

    @Test
    public void notEmptyList() {
        linkedList.add(one);
        assertFalse(linkedList.isEmpty());
    }

    @Test
    public void headList() {

        linkedList.add(one);
        assertEquals(one.getValue(), linkedList.head().getValue());
    }

    @Test
    public void addTwoList() {
        linkedList.add(one);
        linkedList.add(two);
        assertEquals(two.getValue(), linkedList.head().getValue());
    }

    @Test
    public void getLastInList() {
        linkedList.add(one);
        linkedList.add(two);
        assertEquals(one.getValue(), linkedList.get(1).getValue());
    }

    @Test
    public void indexTooLarget() {
        linkedList.add(one);
        linkedList.add(two);
        assertEquals(null,linkedList.get(10));
    }
}