package Introductontojava;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year :  ");
        int year = input.nextInt();
        if(year%4==0){
            System.out.println("Leap year");
        }
        else
        {
            System.out.println(" Not Leap year");
        }
    }
}
