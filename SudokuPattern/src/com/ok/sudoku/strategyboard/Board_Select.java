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
public class Board_Select {
  
    private  final Board board;
    public Board_Select( final Board board)
    {
    this.board=board;
    }
    public int[][] get_Valid_Board()
    {
    return board.get_Valid_Board();
    }
}
