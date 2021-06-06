package javamasterclass.keywordsexpressions;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double first, double second){
        // to check whether the numbers are equal by three decimal places
        int firstNum = (int) (first * 1000);
        int secondNum = (int) (second * 1000);

        if (firstNum == secondNum) {
            return true;
        } else {
            return false;
        }
    }
}
