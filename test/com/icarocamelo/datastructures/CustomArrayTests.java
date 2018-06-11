package com.icarocamelo.datastructures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomArrayTests {
    @Test
    public void initTest(){
        CustomArray newArray = new CustomArray(2);
        assertEquals(newArray.getCapacity(), 2);
    }

    @Test
    public void insertElement(){
        CustomArray newArray = new CustomArray(3);
        newArray.add("value0");
        newArray.add("value1");
        newArray.add("value2");

        newArray.insert(1, "valueX");

        assertEquals(newArray.get(0), "value0");
        assertEquals(newArray.get(1), "valueX");
        assertEquals(newArray.get(2), "value1");
        assertEquals(newArray.get(3), "value2");
    }

    @Test
    public void addElement(){
        CustomArray newArray = new CustomArray(2);
        newArray.add("value0");
        newArray.add("value1");

        assertEquals(newArray.get(0), "value0");
        assertEquals(newArray.get(1), "value1");
    }

    @Test
    public void addElementBeyondInitialCapacity(){
        CustomArray newArray = new CustomArray(2);
        newArray.add("value0");
        newArray.add("value1");
        newArray.add("value2");

        assertEquals(newArray.get(0), "value0");
        assertEquals(newArray.get(1), "value1");
        assertEquals(newArray.get(2), "value2");
        assertEquals(newArray.getCapacity(), 4);
    }

    @Test
    public void deleteElement(){
        CustomArray newArray = new CustomArray(3);
        newArray.add("value0");
        newArray.add("value1");
        newArray.add("value2");

        newArray.delete(1);

        assertEquals(newArray.get(0), "value0");
        assertEquals(newArray.get(1), "value2");
        assertEquals(newArray.getSize(), 2);
    }

    @Test
    public void deleteRandomElement(){
        CustomArray newArray = new CustomArray(4);
        newArray.add("value0");
        newArray.add("value1");
        newArray.add("value2");
        newArray.add("value3");

        newArray.delete(1);

        assertEquals(newArray.get(0), "value0");
        assertEquals(newArray.get(1), "value2");
        assertEquals(newArray.get(2), "value3");
        assertEquals(newArray.getSize(), 3);
    }

    @Test
    public void deleteFirstElement(){
        CustomArray newArray = new CustomArray(3);
        newArray.add("value0");
        newArray.add("value1");
        newArray.add("value2");

        newArray.delete(0);

        assertEquals(newArray.get(0), "value1");
        assertEquals(newArray.get(1), "value2");
        assertEquals(newArray.getSize(), 2);
    }

    @Test
    public void deleteLastElement(){
        CustomArray newArray = new CustomArray(3);
        newArray.add("value0");
        newArray.add("value1");
        newArray.add("value2");

        newArray.delete(2);

        assertEquals(newArray.get(0), "value0");
        assertEquals(newArray.get(1), "value1");
        assertEquals(newArray.getSize(), 2);
    }
}
