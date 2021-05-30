/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamasterclass.keywordsexpressions;

import java.io.BufferedReader;

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
        
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        
        if (score < 5000 && score > 1000){
            System.out.println("Your Score was less than 5000 but greater than 1000");
        }else if (score < 1000){
            System.out.println("Your score was less than 1000");
        }else{
            System.out.println("Got Here");
        }
        
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus); // finalScore is a variable with local scope
            System.out.println("Your final score was - "+ finalScore); 
        }
        
//      int savedFinalScore = finalScore; // cannot access variable created in local scope
        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;
        
        if (gameOver){
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your Final Score was - "+ finalScore);
        }
    }
}
