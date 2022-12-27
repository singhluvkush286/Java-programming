package javabasic;

import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the priciple");
        int principle = input.nextInt();
        System.out.println("enter the rate");
        int rate = input.nextInt();
        System.out.println("enter the time");
        int time = input.nextInt();
        int si;
        si=(principle*rate*time)/100;
        System.out.println("Simple Interest is " + si);

    }
}
