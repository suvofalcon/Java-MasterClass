package javamasterclass.keywordsexpressions;

public class TeenNumberChecker {
    public static boolean hasTeen(int first, int second, int third){
        if((first >= 13 && first <= 19) ||
                (second >= 13 && second <= 19) ||
                (third >= 13 && third <= 19)){
            return true;
        } else {
            return false;
        }
    }
    public static boolean isTeen(int param){
        if (param >= 13 && param <= 19){
            return true;
        }else {
            return false;
        }
    }
}
