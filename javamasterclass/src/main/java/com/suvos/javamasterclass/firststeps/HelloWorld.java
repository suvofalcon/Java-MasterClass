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
public class HelloWorld {
    
    // main method (legendary statement!!)
    public static void main(String[] args){
        System.out.println("Hello World!!");
        
        int myFirstNumber = (10 + 5) + (2 * 10); // Declaration Statement
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
        
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
    }
}
