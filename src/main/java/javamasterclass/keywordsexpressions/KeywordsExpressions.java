/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamasterclass.keywordsexpressions;

/**
 *
 * @author suvo
 */
public class KeywordsExpressions {
    
    public static void main(String[] args) {
        
        // a mile is equal to 1.609344 kilometers
        double kilometers = (100 * 1.609344); // this is an expression
        
        int highScore = 50;
        if(highScore == 50){
            System.out.println("This is an expression");
        }
        
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("My Variable - "+ myVariable);
        System.out.println("This is a test");
        System.out.println("This is" +
                " another"+
                " still more!!");
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);
    }

    // Defining a method
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (score < 5000 && score > 1000){
            System.out.println("Your Score was less than 5000 but greater than 1000");
        }else if (score < 1000){
            System.out.println("Your score was less than 1000");
        }else{
            System.out.println("Got Here");
        }
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus); // finalScore is a variable with local scope
            finalScore += 2000;
            System.out.println("Your final score was - "+ finalScore);
            return finalScore;
        }
        return -1;
    }
}
