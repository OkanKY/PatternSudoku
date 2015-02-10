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
public class ChangeCommand {
    private Command setCommand;
    private Command releaseCommand;
    public  ChangeCommand( Command setCommand, Command releaseCommand)
    {
    this.setCommand=setCommand;
    this.releaseCommand=releaseCommand;
    }
    public ImageIcon setCommand(String value)
    {
    return (ImageIcon)setCommand.change(value);
    }
    public ImageIcon releaseCommand()
    {
    return releaseCommand.change(null);
    }
    
    
}
