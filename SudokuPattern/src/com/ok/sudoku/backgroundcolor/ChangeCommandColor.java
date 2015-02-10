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
public class ChangeCommandColor {
    private Command setCommand;
    private Command releaseCommand;
    public  ChangeCommandColor( Command setCommand, Command releaseCommand)
    {
    this.setCommand=setCommand;
    this.releaseCommand=releaseCommand;
    }
    public Color setCommand(int value)
    {
    return setCommand.change(value);
    }
    public Color releaseCommand()
    {
    return releaseCommand.change(0);
    }
    
    
}
