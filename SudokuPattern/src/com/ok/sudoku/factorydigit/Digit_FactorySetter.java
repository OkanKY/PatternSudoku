/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ok.sudoku.factorydigit;

import com.ok.sudoku.factorydigit.Digit;

/**
 *
 * @author okan
 */
public class Digit_FactorySetter {
    private final String nine = "SET_VALUE_9X9";
    private final String six = "SET_VALUE_6X6";
    
    public Digit Digit_FactoryGetter(String select)
    {
    if(select==six)
    {
    return new Digit_Value_6x6();
    }
    else
    if(select==nine)
    {
    return new Digit_Value_9x9();
    }
    return new Digit_Value_9x9();  
    }
}
