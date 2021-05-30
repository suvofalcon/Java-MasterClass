/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamasterclass.firststeps;

/**
 *
 * @author suvosmac
 * Primitive Types
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
        
        // If we find to read a large integer number, we can declare as below for readability
        int myMaxIntTest = 2_147_483_647; // 2147483647      
        
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = "+ myMinByteValue);
        System.out.println("Byte Maximum Value = "+ myMaxByteValue);
        
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = "+ myMinShortValue);
        System.out.println("Short Maximum Value = "+ myMaxShortValue);  
        
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = "+ myMinLongValue);
        System.out.println("Long Maximum Value = "+ myMaxLongValue);
        
        // Java will treat all assignments by default as int unless explicitly mentioned as L at the end
        long bigLongLiteralValue = 2_147_483_648L;    

        int myTotal = myMinIntValue / 2;
        
        // arithmetic calculations are done by promoting byte and short to int
        // hence we need to cast it explicitly
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue/2);
        
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;
        
        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);
       
        // cast it to short, else arithmetic part will be promoted to int
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("shortTotal = "+ shortTotal);
    }
}