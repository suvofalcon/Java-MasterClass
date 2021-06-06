package javamasterclass.keywordsexpressions;

public class SpeedConverter {

    // Will do the conversion between kilometers and miles
    public static long toMilesPerHour(double kilometersPerHour){
        // Check for invalid value
        if (kilometersPerHour < 0){
            return -1;
        }
        return (Math.round(kilometersPerHour / 1.609));
    }
    // This will print the method
    public static void printConversion(double kilometersPerHour){

        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else{
            // do the calculation
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +
                    " km/h " + "= " + milesPerHour + " mi/h");
        }
   }
}
