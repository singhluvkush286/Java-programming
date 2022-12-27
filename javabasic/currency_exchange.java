package javabasic;

import java.util.Scanner;

public class currency_exchange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Currency Exhange Bank");
        System.out.println("Enter the amount to Exchange in rupee");
        float currency=input.nextFloat();
        float USD=currency*80;
        System.out.println("USD Amount is " + USD);

    }

}
