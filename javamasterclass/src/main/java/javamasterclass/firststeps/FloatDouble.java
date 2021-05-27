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
public class FloatDouble {
    
    public static void main(String[] args) {
        
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = "+ myMinFloatValue);
        System.out.println("Float Maximum Value = "+ myMaxFloatValue);
        
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = "+ myMinDoubleValue);
        System.out.println("Double Maximum Value = "+ myMaxDoubleValue);
        
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f; // Since Double is what is considered as default
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue = "+ myIntValue);
        System.out.println("MyFloatValyue = "+ myFloatValue);
        System.out.println("MyDoubleValue = "+ myDoubleValue); // Double has more precision in arithmetic computations
        
        // Challenge to convert pounds to kilograms
        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted Kilograms = "+ convertedKilograms);
    }
}
