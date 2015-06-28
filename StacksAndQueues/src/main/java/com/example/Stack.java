package com.example;

public class Stack implements Collection {

    private java.util.Stack stack = new java.util.Stack();

    public void put(Object item) {
        stack.push(item);
    }

    public Object get() {
        return stack.pop();
    }
}
