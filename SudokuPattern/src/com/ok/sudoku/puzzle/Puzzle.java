/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ok.sudoku.puzzle;

import java.util.Arrays;

/**
 *
 * @author okan
 */
public class Puzzle implements Prototype  {
   
    private int[][] puzzle;


    public Puzzle(int[][] puzzle)
    {
    this.puzzle=puzzle;
    }
    public  Puzzle clone () 
    {

      int[][] copy = new int[puzzle.length][];
       for (int i = 0; i < puzzle.length; i++) 
        {
            copy[i] = Arrays.copyOf(puzzle[i], puzzle[i].length);
        }
    return new Puzzle(copy);
    
    }
       
    public int[][] getPuzzle() {
        return puzzle;
    }

    public void setPuzzle(int[][] puzzle) {
        this.puzzle = puzzle;
    }

}
