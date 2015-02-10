/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ok.sudoku.test.prototype.puzzle;

import com.ok.sudoku.puzzle.Puzzle;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author okan
 */
public class TestPuzzle {
        private  Puzzle puzzle;
     @Before
    public void Before()
    {
        System.out.println("Testing Start Prototype Puzzle");
    }
    
     @After
    public void After()
    {
      System.out.println("Finish  Testing Prototype Puzzle");
    }
   
    @Test
    public void testPuzzleClone()
    {
        int[][] expected = {
        {1, 2, 3, 4, 5, 6},
        {4, 5, 6, 1, 2, 3},
        {2, 3, 4, 5, 6, 1},
        {5, 6, 1, 2, 3, 4},
        {3, 4, 5, 6, 1, 2},
        {6, 1, 2, 3, 4, 5}};
       
        puzzle = new Puzzle(expected);
        int[][] actual = puzzle.getPuzzle().clone();
       
        for (int i = 0; i < actual.length; i++) {
            for (int j = 0; j < actual.length; j++) {
                Assert.assertEquals(expected[i][j], actual[i][j]);
                System.out.print(actual[i][j]);
            }
            System.out.println();
        }

    }
   
}
