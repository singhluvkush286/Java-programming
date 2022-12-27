package javabasic;

import java.util.Scanner;

public class maximum_of_twonuber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two number");
        int num1=input.nextInt();
        int num2=input.nextInt();
        if(num1>num2){
            System.out.println(num1+" is the maximum number " );
        }
        else{
            System.out.println(num2+" is the maximum number " );
        }
    }
}
