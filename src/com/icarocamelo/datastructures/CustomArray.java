package com.icarocamelo.datastructures;

public class CustomArray {
    String[] values;
    private int capacity;
    private int size = 0;

    public CustomArray(int capacity){
        values = new String[capacity];
    }

    public int getCapacity(){
        capacity = values.length;
        return capacity;
    }

    public void add(String element) {
        if (size + 1 > getCapacity()){
            resize();
        }

        // insert element
        values[size] = element;

        // update last element index
        size++;
    }

    private void resize() {
        // resize
        String[] newArray = new String[getCapacity()*2];

        // copy elements from one array to another
        for(int i = 0; i < values.length; i++){
            newArray[i] = values[i];
        }

        // update reference
        values = newArray;
    }

    public String get(int index) {
        return values[index];
    }

    public void delete(int index) {
        for (int i = index; i < size-1; i++) {
            values[i] = values[i+1];
        }
        size--;
    }

    public void insert(int index, String element) {
        if (size + 1 > getCapacity()){
            resize();
        }

        for (int i = size; i > index; i--) {
            values[i] = values[i-1];
        }

        values[index] = element;
        size++;
    }

    public int getSize() {
        return size;
    }
}
