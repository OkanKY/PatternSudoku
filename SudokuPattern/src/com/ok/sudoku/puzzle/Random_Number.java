/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ok.sudoku.puzzle;

import java.util.Random;

/**
 *
 * @author okan
 */
public class Random_Number {
    private Random random;
    public Random_Number()
    {
    random = new Random();
    }
    public int Next_Number(int tolerance)
    {
    return random.nextInt(tolerance);
    }
    
}
