package javabasic;

import java.util.Scanner;

public class subtract_product_and_sum_of_digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=in.nextInt();
        int sum=0 ,mul=1;

        int temp=num;
        while(temp!=0){
            int n=temp%10;
            sum+=n;
            mul*=n;
            temp/=10;
        }
        System.out.println("Subtraction between product of number and sum of digit "+ (mul-sum));
    }
}
