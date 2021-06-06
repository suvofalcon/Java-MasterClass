package javamasterclass.keywordsexpressions;

public class MegaBytesConverter {
    // This will do the Kilo bytes to mega bytes conversion
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        // Check for invalid value
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int megaBytes = (int) (kiloBytes / 1024);
            int remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB " + "= " + megaBytes + " MB " + "and " +
                    remainder + " KB");
        }
    }
}
