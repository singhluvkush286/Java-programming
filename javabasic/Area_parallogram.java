package javabasic;

import java.util.Scanner;

public class Area_parallogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the parallel of the parallelogram ");
        double s1= in.nextDouble();
        double s2= in.nextDouble();
        System.out.println("Enter the height of the parallogram ");
        double h= in.nextDouble();

        double area = .5*(s1+s2)*h;
        System.out.println(area + " is the area of the circle ");
    }
}
