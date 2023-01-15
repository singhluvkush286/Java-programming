package javabasic;

import java.util.Scanner;

public class Area_rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle ");
        double length= in.nextDouble();
        System.out.println("Enter the breath of Rectangle ");
        double breath= in.nextDouble();
        double area = length*breath;
        System.out.println(area + " is the area of the Rectangle ");
    }
}
