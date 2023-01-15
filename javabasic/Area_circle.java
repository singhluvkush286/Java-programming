package javabasic;
import java.util.Scanner;

public class Area_circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle ");
        double radius= in.nextDouble();
        double area = 3.14*(Math.pow(radius,2));
        System.out.println(area + " is the area of the circle ");
    }
}
