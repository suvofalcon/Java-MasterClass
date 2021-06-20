package javamasterclass.controlflow;

public class SwitchDemo {
    public static void main(String[] args) {
        int switchVal = 4;

        switch(switchVal){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was either 3, 4, 5");
                break;
            default:
                System.out.println("Other values");
                break;
        }

        String month = "June";
        switch(month.toUpperCase()){
            case "JANUARY":
                System.out.println("January Month");
                break;
            case "JUNE":
                System.out.println("June Month");
                break;
            default:
                System.out.println("Other Month");
                break;
        }
    }
}
