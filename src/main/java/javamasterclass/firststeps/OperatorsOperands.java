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
public class OperatorsOperands {
    
    public static void main(String[] args) {
        
        int result = 1 + 2; // two operator (=, +)
        System.out.println("1 + 2 = "+ result);
        
        int previousResult = result;
        System.out.println("previousResult = "+ result);
        result = result - 1;
        System.out.println("3 - 1 = "+ result);
        
        result = result * 10;
        System.out.println("2 * 10 = "+ result);
        result = result / 5;
        System.out.println("20 / 5 = "+ result);
        
        result = result % 3; // the remainder of division
        System.out.println("4 % 3 = "+ result);
        
        // increment operator
        result++;
        System.out.println("result++ = "+ result);
        
        result--;
        System.out.println("result-- ="+ result);
        
        result += 2;
        System.out.println("1 + 2 = "+ result);
        
        result *= 10;
        System.out.println("3 * 10 = "+ result);
        
        result /= 3;
        System.out.println("30 / 3 = "+ result);
        
        result -= 2;
        System.out.println("10 - 2 = "+ result);
        
        boolean isAlien = false;
        if (isAlien == false){
            System.out.println("It is not an alien!");
            System.out.println("I am still scared of Aliens!!");
        }
        
        //Logical AND
        int topScore = 100;
        if (topScore >= 100){
            System.out.println("You Got the High School!");
        }
        
        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore <= 100){
            System.out.println("Greater than secondTopScore and less than equal to 100");
        }
        
        //Logical OR
        if ((topScore > 90) || (secondTopScore < 60)){
            System.out.println("Greater than topScore and not Less than secondTopScore");
        }
        
        // NOT Operator
        boolean isCar = false;
        if(!isCar){
            System.out.println("This is supposed to happen?");
        }
        
        //ternary operator
        boolean wasCar = isCar ? true: false;
        System.out.println("The boolean value "+ wasCar);
        
        // Operator Challenge
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        
        double operationValue = (myFirstValue + mySecondValue) * 100;
        int operationRemainder = (int) (operationValue % 40.00);
        boolean isRemainder = (operationRemainder == 0)? true: false;
        System.out.println("Operation Value - "+ operationValue);
        System.out.println("isRemainder - "+ isRemainder);
        
        // This will not be displayed
        if(!isRemainder){
            System.out.println("We got some remainder");
        }
    }    
}
