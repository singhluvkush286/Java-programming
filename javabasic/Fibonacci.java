package javabasic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of term");
        int num=input.nextInt();
        int temp =1;
        int a =0;
        int n;
        for(int i = 1;i<=num;i++){
            if(i==1){
                System.out.println(a);
            } else if (i==2) {
                System.out.println(temp);
            }
            else{
                n=a+temp;
                System.out.println(n);
                a=temp;
                temp=n;
            }
        }

    }
}
