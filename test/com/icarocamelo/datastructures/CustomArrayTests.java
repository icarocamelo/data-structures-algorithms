package com.icarocamelo.datastructures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomArrayTests {
    @Test
    public void initTest(){
        CustomArray newArray = new CustomArray(2);
        assertEquals(newArray.getCapacity(), 2);
    }
}
