package com.swapnilxi.springboottesting.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator;
 @BeforeAll
   static void setup(){
      System.out.println("executing before all method");
   }
    @BeforeEach
    public void setup2(){
        calculator= new Calculator();
    }

    @Test
   public void testMultiply(){
      calculator = new Calculator();
      assertEquals(25,calculator.multiply(4, 05));
      assertEquals(25,calculator.multiply(5, 05));

   }
   @Test
   public void testdivide(){
      calculator = new Calculator();
      assertEquals(0,calculator.divide(4, 0));
   }


}

