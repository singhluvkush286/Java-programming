package Introductontojava;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int num1 = input.nextInt();
        System.out.println("Enter Second Number :");
        int num2 = input.nextInt();
        // Dynamic intialization 
         int sum =num1 + num2;
        System.out.println("Sum of number is "+sum);

    }
}
