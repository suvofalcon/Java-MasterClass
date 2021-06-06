package javamasterclass.keywordsexpressions;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hour){
        //Check invalid
        if (hour < 0 || hour > 23){
            return false;
        } else if(barking && (hour < 8 || hour > 22)) {
            return true;
        } else {
            return false;
        }
    }
}
