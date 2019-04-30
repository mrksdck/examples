package com.example;

import java.util.ArrayList;
import java.util.List;

public class Queue implements Collection {

    private List list = new ArrayList();

    public void put(Object item) {
        list.add(item);
    }

    public Object get() {
        return list.remove(0);
    }
}
