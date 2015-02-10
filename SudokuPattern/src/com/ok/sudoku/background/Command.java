/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ok.sudoku.background;

import javax.swing.ImageIcon;

/**
 *
 * @author okan
 */
public interface Command {
    public ImageIcon change(String value);
}
