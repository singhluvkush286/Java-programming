package javabasic;
import java.util.Scanner;

public class Area_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the height of Triangle ");
        double height= in.nextDouble();
        System.out.println("Enter the base of Triangle ");
        double base= in.nextDouble();
        double area = .5*height*base;
        System.out.println(area + " is the area of the triangle ");
    }
}
