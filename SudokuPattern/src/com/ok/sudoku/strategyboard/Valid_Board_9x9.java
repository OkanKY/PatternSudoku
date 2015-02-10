/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ok.sudoku.strategyboard;

import com.ok.sudoku.strategyboard.Board;

/**
 *
 * @author okan
 */
public class Valid_Board_9x9 implements Board {

    public int[][] get_Valid_Board() 
    {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    int[][] VALID_BOARD_9X9 = {
        {4, 3, 5, 8, 7, 6, 1, 2, 9},
        {8, 7, 6, 2, 1, 9, 3, 4, 5},
        {2, 1, 9, 4, 3, 5, 7, 8, 6},
        {5, 2, 3, 6, 4, 7, 8, 9, 1},
        {9, 8, 1, 5, 2, 3, 4, 6, 7},
        {6, 4, 7, 9, 8, 1, 2, 5, 3},
        {7, 5, 4, 1, 6, 8, 9, 3, 2},
        {3, 9, 2, 7, 5, 4, 6, 1, 8},
        {1, 6, 8, 3, 9, 2, 5, 7, 4}};
     return VALID_BOARD_9X9;
    }
    
}
