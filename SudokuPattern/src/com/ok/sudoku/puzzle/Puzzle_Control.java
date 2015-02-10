/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ok.sudoku.puzzle;

import com.ok.sudoku.value.Game_Mode;

/**
 *
 * @author okan
 */
public class Puzzle_Control {
   // private int[][] puzzle;
    private Puzzle puzzle;
    private Random_Number random =new Random_Number();
    public int[][] createPuzzle(int[][] board, int mode) {
        
        this.puzzle = new Puzzle(board).clone();
        int numOfEmptyBlock = getNumberOfEmptyBlock(board, mode);
        for (int i = 0; i < numOfEmptyBlock; i++) {
            int[] rowcol = getTwoRanNum(0, board.length);
            this.puzzle.getPuzzle()[rowcol[0]][rowcol[1]] = 0;
        }
        return this.puzzle.getPuzzle().clone();
    }
           
        public int[][] resetPuzzle() {
        return puzzle.getPuzzle();
    }
   
    private int getNumberOfEmptyBlock(int[][] board, int mode) 
    {
    int numOfEmptyBlock = 0;
    int numOfBlock = board.length * board[0].length;

    if (Game_Mode.GAME_MODE_EASYER <= mode && mode <= Game_Mode.GAME_MODE_EXPART)
    {
            numOfEmptyBlock = (int) Math.floor((mode * numOfBlock) / 100);
    } 
    else 
    {
            numOfEmptyBlock = (int) Math.floor((Game_Mode.GAME_MODE_MEDIUM * numOfBlock) / 100);
    }
        
    int tolerance = (int) Math.floor(((numOfBlock - numOfEmptyBlock) * 5) / 100);
        
    numOfEmptyBlock += random.Next_Number(tolerance + 1); // to avoid negetive 

        
    return numOfEmptyBlock;
    }
    private int[] getTwoRanNum(int min, int tolerance) 
    {
    int a[] = new int[2];
    a[0] = min + random.Next_Number(tolerance);
    a[1] = min + random.Next_Number(tolerance);
    return a;
    }

}
