/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamasterclass.firststeps;

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
        
        String myString = "This is a String";
        System.out.println("my string is = "+ myString);
        myString = myString + ", and another String!!";
        System.out.println("my string is = "+ myString);
        myString = myString + "\u00A9 2021";
        System.out.println("my string is = "+ myString);
        
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt; // Integer will be converted to String
        System.out.println("Last String is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("Last String is now "+ lastString);
    }
}
