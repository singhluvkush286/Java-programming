package com.luvkush;

import java.util.Scanner;

public class checkchar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if( ch>= 'a' && ch<= 'z')
        {
            System.out.println("lower case letter");
        }
        else
        {
            System.out.println("Upper case letter");
        }
    }
}
