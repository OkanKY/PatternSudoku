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
public class BackgroundSetColor implements Command {
    private  BackgroundColor Item;
    public  BackgroundSetColor( BackgroundColor Item)
    {
    this.Item=Item;     
    }
    public Color change(int value) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     return Item.GetBackground( value);
    }
    
}
