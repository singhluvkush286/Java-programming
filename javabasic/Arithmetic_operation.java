package javabasic;

import java.util.Scanner;

public class Arithmetic_operation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two number");
        int num1=input.nextInt();
        int num2=input.nextInt();
        System.out.println("enter the operation to perform");
        char operand=input.next().charAt(0);
        int result;
        if (operand =='+'){
            result = num1+num2;
            System.out.println("result is " +result);
        } else if (operand =='-') {
            result = num1-num2;
            System.out.println("result is " +result);
        }
        else if (operand =='*') {
            result = num1*num2;
            System.out.println("result is " +result);
        }
        else if (operand =='/') {
            result = num1/num2;
            System.out.println("result is " +result);
        }
        else{
            System.out.println("Invalid Input");
        }


    }
}
