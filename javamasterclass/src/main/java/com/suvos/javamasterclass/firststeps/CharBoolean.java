/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.suvos.javamasterclass.firststeps;

/**
 *
 * @author suvosmac
 */
public class CharBoolean {
    
    public static void main(String[] args) {
        
        char myChar = 'D'; // it takes 2 byte in memory because it allows us to store unicode characters
        char myUnicodeChar = '\u0044'; // The value is taken from unicode-table.com
        char myAnotherUnicode = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(myAnotherUnicode);
        
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        
        boolean isCustomerOverTwentyOne = true;
        
    }
}
