package Condition_loop;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to get Factorial :");
        int num=in.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++)
            fact=fact*i;
        System.out.print("The factorial of "+num+" is  : "+fact);
    }
}
