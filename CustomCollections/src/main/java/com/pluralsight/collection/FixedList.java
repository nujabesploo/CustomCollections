package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {

    private List<T> items;
    private int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<T>();
    }

    public void add(T item) {

        if (items.size() < maxSize) {
            items.add(item);
        } else {
            // Option 1: Throw an exception when list is full
            throw new IllegalStateException("Cannot add item. FixedList has reached maximum capacity of " + maxSize);

        }
    }

    public List<T> getItems() {
        return items;
    }

}
