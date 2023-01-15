package javabasic;

import java.util.*;

public class Area_Isosceles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Side  of the Triangle ");
        double side = in.nextDouble();
        double area = .5*(Math.sqrt(3))*(Math.pow(side,2));
        System.out.println(area + " is the area of the circle ");
    }
}
