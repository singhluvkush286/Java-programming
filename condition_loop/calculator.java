package com.luvkush;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two number to perform operation");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int ans = 0;
        //char op=in.next().trim().charAt(0);
        while(true){
            System.out.println("Enter the valid operator for the calculation");
            char op = in.next().trim().charAt(0);
            System.out.println();

            if(op=='+' || op=='-' || op=='/' || op=='*' || op=='*') {
                if(op=='+'){
                    ans=num1 + num2 ;
                }
                if(op=='-'){
                    ans=num1 -num2 ;
                }
                if(op=='*'){
                    ans=num1 * num2 ;
                }
                if(op=='%'){
                    ans=num1 % num2 ;
                }
                if(op=='/'){
                    if(num2!=0)
                    ans=num1/ num2 ;
                }
                System.out.println(ans);

            } else if (op=='x' || op=='X') {
                break;
            }
            else{
                System.out.println("Inavalid input");
            }

        }
    }
}
