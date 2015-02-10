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
import java.util.Arrays;
import javafx.scene.paint.Color;
import junit.framework.Assert;
import static junit.framework.Assert.fail;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.awt.*;
/**
 *
 * @author okan
 */
public class TestBackgroundColor {
   
    private static ChangeCommandColor changeColor;
    @Before
    public void Before()
    {
        System.out.println("Testing Start Command Pattern For  Background Color");
        
        
    }
      @BeforeClass
    public static void BeforeClass()
    {
        System.out.println("Before Class");
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
   
        @Test
    public void testBackgroundColor()
    {
    
        java.awt.Color expected =changeColor.setCommand(-65536);
       java.awt.Color actual =new java.awt.Color(-65536);
        Assert.assertEquals(expected,actual);

    }
        @Test
    public void testBackgroundColorRelease()
    {
       java.awt.Color expected =changeColor.releaseCommand();
       java.awt.Color actual =null;
        Assert.assertEquals(expected,actual);

    }

    
}
