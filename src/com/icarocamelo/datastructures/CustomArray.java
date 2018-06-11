package com.icarocamelo.datastructures;

public class CustomArray {
    String[] values;
    private int capacity;

    public CustomArray(int capacity){
        this.capacity = capacity;
        values = new String[capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
