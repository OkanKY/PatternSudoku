/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ok.sudoku.puzzle;

/**
 *
 * @author okan
 */
public interface Prototype  {
    public  Puzzle clone ( /*int[][] original*/);
    public int[][] getPuzzle();
    public void setPuzzle(int[][] puzzle);
}
