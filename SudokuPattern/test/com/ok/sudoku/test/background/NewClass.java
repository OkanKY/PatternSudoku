/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ok.sudoku.test.background;

import com.ok.sudoku.backgroundcolor.BackgroundColor;
import com.ok.sudoku.backgroundcolor.BackgroundReleaseColor;
import com.ok.sudoku.backgroundcolor.BackgroundSetColor;
import com.ok.sudoku.backgroundcolor.ChangeCommandColor;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author okan
 */
public class NewClass {
     private ChangeCommandColor changeColor;
    @Before
    public void Before()
    {
        System.out.println("Testing Start Command Pattern For  Background Color");
        //Command Pattern For  Background Color
        BackgroundColor ItemColor=new BackgroundColor();
        BackgroundSetColor setColor=new BackgroundSetColor(ItemColor);
        BackgroundReleaseColor releaseColor =new BackgroundReleaseColor(ItemColor);
        changeColor =new ChangeCommandColor(setColor, releaseColor);
    }
    @After
    public void After()
    {
      System.out.println("Finish  Testing Command Pattern For  Background Color");
    }
     /* 
    @BeforeClass
    public static void BeforeClass()
    {
        System.out.println("Before Class");
    }
    @AfterClass
    public static void AfterClass()
    {
      System.out.println("After Class");
    }
    
    @Test
    public void test()
    {
   // fail("deneme");
        Assert.assertEquals("ABCa","ABCa");
        Assert.assertTrue(true);

    }
    */
        @Test
    public void testBackgroundColor()
    {
    
        Assert.assertEquals(changeColor.setCommand(-65536),new java.awt.Color(-65536));

    }
  /*  @Test(expected=NullPointerException.class) 
    public void testArray()
    {
   // fail("deneme");
        int a[]={};
        Arrays.sort(a);
        
        
    }
    @Test(timeout=1) 
    public void testArrayTime()
    {
   // fail("deneme");
        while(true)
        {}
        
        
    }*/
    
}
