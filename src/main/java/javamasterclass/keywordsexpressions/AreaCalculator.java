package javamasterclass.keywordsexpressions;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("Area of Circle " + area(5.0));
        System.out.println("Area of a rectange " + area(5.0, 4.0));
    }

    public static double area(double radius){
        if (radius < 0) return -1;
        return (Math.PI * radius * radius);
    }

    public static double area(double x, double y){
        if ((x < 0) || (y < 0)) return -1;
        return (x * y);
    }
}
