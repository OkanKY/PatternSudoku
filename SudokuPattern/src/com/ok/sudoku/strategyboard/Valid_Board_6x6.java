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
public class Valid_Board_6x6  implements Board{

    public int[][] get_Valid_Board() {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   int[][] VALID_BOARD_6X6 = {
        {1, 2, 3, 4, 5, 6},
        {4, 5, 6, 1, 2, 3},
        {2, 3, 4, 5, 6, 1},
        {5, 6, 1, 2, 3, 4},
        {3, 4, 5, 6, 1, 2},
        {6, 1, 2, 3, 4, 5}};
   return VALID_BOARD_6X6;
    }
    
    
}
