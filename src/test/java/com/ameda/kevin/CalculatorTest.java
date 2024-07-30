package com.ameda.kevin;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


/*
@author ameda
*/

public class CalculatorTest{

    private Calculator calc;

    @Before
    public void setUp(){
        calc = new Calculator();
    }
    //Arrange (setup)
    // Act (SUT)
    // Assert (few assertions) framework

    @Test
    public void testAdd() {
        //Arrange
        int a=100, b =50;
        //Act
        int result = calc.add(a,b);
        //Assert
        assertEquals(150,result);
    }

}