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
public class ByteShortIntLong {
    
    public static void main(String[] args){
        
        int myValue = 10000;
        
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = "+ myMinIntValue);
        System.out.println("Integer Maximum Value = "+ myMaxIntValue);
        System.out.println("Busted Max Value = "+ (myMaxIntValue + 1)); // Integer overflow will happen       
        System.out.println("Busted Min Value = "+ (myMinIntValue - 1)); // Integer underflow
        
        // If we find to read a large integer number, we can declare as
        int myMaxIntTest = 2_147_483_647; // 2147483647
        
        
    }
}
