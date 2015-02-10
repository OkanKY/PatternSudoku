/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ok.sudoku.backgroundcolor;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author okan
 */
public interface Command {
    public Color change(int value);
}
