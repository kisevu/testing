package com.ameda.kevin;

import org.junit.Test;

/*
@author ameda
*/
public class CalculatorTest{



    @Test(expected = RuntimeException.class)
    public void testAdd() {
        throw new RuntimeException("Oops");
    }
}