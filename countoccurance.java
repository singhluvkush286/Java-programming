package com.luvkush;

public class countoccurance {
    public static void main(String[] args) {
        int num =9939342;
        int rem ;
        int count=0;
        while (num > 0) {
            rem=num%10;
            if(rem==9)
            {
                count = count + 1;
            }
            num = num/10;
        }
        System.out.println("occurance of number 9 is "+ count);

    }
}
