package javamasterclass.keywordsexpressions;

public class SecondsAndMinuteChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 4));
        System.out.println(getDurationString(2744L));
    }

    private static String getDurationString(long minutes, long seconds){
        if((minutes < 0 ) || (seconds < 0) || (seconds > 59)) return "Invalid Value";

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return (hours + "h " + remainingMinutes + "m " + seconds +"s ");
    }

    // overloaded method
    private static String getDurationString(long seconds){
        if (seconds < 0) return "Invalid Value";

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return (getDurationString(minutes, remainingSeconds));
    }
}
