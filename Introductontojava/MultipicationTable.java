package Introductontojava;

import java.util.Scanner;

public class MultipicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number to get multiplication table :  ");
        int num = input.nextInt();
        int i;
        for(i=1;i<=10;i++)
        {
            System.out.println(num+" X  "+i+" = "+num*i);
        }
    }
}
