package javamasterclass.keywordsexpressions;

public class Main {

    // This class is just going to test some other classes
    public static void main(String[] args) {

        // Testing SpeedConverter Class
        SpeedConverter.printConversion(10.25);
        SpeedConverter.printConversion(-5.6);

        //Testing KiloBytes to MegaBytes Converter
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);

        // Testing Barking Dog
        System.out.println(BarkingDog.shouldWakeUp(true, 1));
    }
}
