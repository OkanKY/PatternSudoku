/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ok.sudoku.test.background;

import com.ok.sudoku.background.BackgroundImage;
import com.ok.sudoku.background.BackgroundRelease;
import com.ok.sudoku.background.BackgroundSet;
import com.ok.sudoku.background.ChangeCommand;
import com.ok.sudoku.backgroundcolor.BackgroundColor;
import com.ok.sudoku.backgroundcolor.BackgroundReleaseColor;
import com.ok.sudoku.backgroundcolor.BackgroundSetColor;
import com.ok.sudoku.backgroundcolor.ChangeCommandColor;
import javax.swing.ImageIcon;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author okan
 */
public class TestBackgroundImage {
     
     private  static ChangeCommand change;
    @Before
    public void Before()
    {
        System.out.println("Testing Start Command Pattern For  Background Image");
       
    }
    @BeforeClass
    public static void BeforeClass()
    {
        System.out.println("Before Class");
         BackgroundImage Item=new BackgroundImage();
        BackgroundSet set=new BackgroundSet(Item);
        BackgroundRelease release =new BackgroundRelease(Item);
        change =new ChangeCommand(set, release);
       // setBackground(change.setCommand("D:\\sudoku3.jpg"));
       // setBackground(change.releaseCommand());
    }
    @After
    public void After()
    {
      System.out.println("Finish  Testing Command Pattern For  Background Image");
    }
 
        @Test
    public void testBackgroundImage()
    {
      ImageIcon  expected=change.setCommand("D:\\sudoku3.jpg");
      ImageIcon  actual =new ImageIcon("D:\\sudoku3.jpg");
      Assert.assertTrue(actual.getImage().equals(expected.getImage()));

       
    }
    
            @Test
    public void testBackgroundImageRelease()
    {
      ImageIcon  expected=change.releaseCommand();
      ImageIcon  actual =null;
       Assert.assertEquals(expected,actual);

       
    }
 
}
