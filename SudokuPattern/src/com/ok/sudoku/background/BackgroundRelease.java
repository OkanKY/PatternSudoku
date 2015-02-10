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
public class BackgroundRelease implements Command {
    private  BackgroundImage Item;
    public  BackgroundRelease( BackgroundImage Item)
    {
    this.Item=Item;     
    }
    public ImageIcon change(String value) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      return Item.ReleaseBackground();
    }
}
