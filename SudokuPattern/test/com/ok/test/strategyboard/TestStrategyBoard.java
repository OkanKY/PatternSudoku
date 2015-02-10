/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ok.test.strategyboard;

import com.ok.sudoku.strategyboard.Board_Select;
import com.ok.sudoku.strategyboard.Valid_Board_6x6;
import com.ok.sudoku.strategyboard.Valid_Board_9x9;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author okan
 */
public class TestStrategyBoard {
     private static Board_Select board_Select_6x6;
     private static Board_Select board_Select_9x9;
     @Before
    public void Before()
    {
        System.out.println("Testing Start Srategy  Board");
    }
      @BeforeClass
    public static void BeforeClass()
    {
        System.out.println("Before Class");
        //Strategy Pattern 
        board_Select_6x6 =new Board_Select(new Valid_Board_6x6());
        board_Select_9x9 =new Board_Select(new Valid_Board_9x9());
    }
     @After
    public void After()
    {
      System.out.println("Finish  Testing Srategy  Board");
    }
   
    @Test
    public void testBoardNine()
    {
       System.out.println("Start  Testing Nine Srategy  Board");
       int[][] expected = {
        {4, 3, 5, 8, 7, 6, 1, 2, 9},
        {8, 7, 6, 2, 1, 9, 3, 4, 5},
        {2, 1, 9, 4, 3, 5, 7, 8, 6},
        {5, 2, 3, 6, 4, 7, 8, 9, 1},
        {9, 8, 1, 5, 2, 3, 4, 6, 7},
        {6, 4, 7, 9, 8, 1, 2, 5, 3},
        {7, 5, 4, 1, 6, 8, 9, 3, 2},
        {3, 9, 2, 7, 5, 4, 6, 1, 8},
        {1, 6, 8, 3, 9, 2, 5, 7, 4}};
        int[][] actual =board_Select_9x9.get_Valid_Board();
        for (int i = 0; i < actual.length; i++) {
            for (int j = 0; j < actual.length; j++) {
                Assert.assertEquals(expected[i][j], actual[i][j]);
                System.out.print(actual[i][j]);
            }
            System.out.println();
        }

    }
    @Test
     public void testBoardSix()
    {
     System.out.println("Start  Testing Six Srategy  Board");
        int[][] expected = {
        {1, 2, 3, 4, 5, 6},
        {4, 5, 6, 1, 2, 3},
        {2, 3, 4, 5, 6, 1},
        {5, 6, 1, 2, 3, 4},
        {3, 4, 5, 6, 1, 2},
        {6, 1, 2, 3, 4, 5}};
        int[][] actual =board_Select_6x6.get_Valid_Board();
        for (int i = 0; i < actual.length; i++) {
            for (int j = 0; j < actual.length; j++) {
                Assert.assertEquals(expected[i][j], actual[i][j]);
                System.out.print(actual[i][j]);
            }
            System.out.println();
        }

    }
     
}
