package com.luvkush;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int num =9939342;
        int rem , rev ;
        rev = 0;
        while( num >0){

            rem= num % 10;
            rev = rev * 10+ rem;
            num/=10;
        }
        System.out.println(rev);
    }
}
