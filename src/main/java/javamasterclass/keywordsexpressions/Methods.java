package javamasterclass.keywordsexpressions;

/**
 *
 * @author suvo
 */
public class Methods {

    public static void main(String[] args) {

        // a mile is equal to 1.609344 kilometers
        double kilometers = (100 * 1.609344); // this is an expression

        int highScore = 50;
        if (highScore == 50) {
            System.out.println("This is an expression");
        }

        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("My Variable - " + myVariable);
        System.out.println("This is a test");
        System.out.println("This is" +
                " another" +
                " still more!!");
        int returnScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your Final Score was - " + returnScore);
        calculateScore(true, 10000, 8, 200);

        displayHighScorePosition("John", 4);
        int newScore = calculateHighScorePosition(50);
        System.out.println("As per the high score position the new score is " + newScore);
    }

    // Defining a method
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (score < 5000 && score > 1000) {
            System.out.println("Your Score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got Here");
        }
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus); // finalScore is a variable with local scope
            finalScore += 2000;
            System.out.println("Your final score was - " + finalScore);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println("Player " + name + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4; //assuming position 4 will be returned by default
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }
}

