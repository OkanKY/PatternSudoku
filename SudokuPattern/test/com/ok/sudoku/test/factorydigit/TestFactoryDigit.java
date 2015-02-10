/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ok.sudoku.test.factorydigit;

import com.ok.sudoku.factorydigit.Digit_FactorySetter;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author okan
 */
public class TestFactoryDigit {
    
    private static Digit_FactorySetter digitFactory;
     @Before
    public void Before()
    {
        System.out.println("Testing Start Factory Digit");
    }
      @BeforeClass
    public static void BeforeClass()
    {
        System.out.println("Before Class");
        digitFactory =new Digit_FactorySetter();
    }
     @After
    public void After()
    {
      System.out.println("Finish  Testing Factory Digit");
    }
   
    @Test
    public void testDigitNine()
    {

        String expected =digitFactory.Digit_FactoryGetter("SET_VALUE_9X9").getDigit();
        String actual ="123456789";
        Assert.assertEquals(expected,actual);

    }
    @Test
     public void testDigitSix()
    {

        String expected =digitFactory.Digit_FactoryGetter("SET_VALUE_6X6").getDigit();
        String actual ="123456";
        Assert.assertEquals(expected,actual);

    }
}
