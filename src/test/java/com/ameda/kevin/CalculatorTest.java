package com.ameda.kevin;

import org.junit.Test;

import static org.junit.Assert.*;


/*
@author ameda
*/

public class CalculatorTest{

    //Arrange (setup)
    // Act (SUT)
    // Assert (few assertions) framework

    @Test
    public void testAdd() {
        //Arrange
        int a=100, b =50;
        //Act
        int result = Calculator.add(a,b);
        //Assert
        assertEquals(150,result);
    }

}