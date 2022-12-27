package javabasic;

import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        if(num%2==0)
        {
            System.out.println("Given numeber is Even");
        }
        else{
            System.out.println("Given numeber is Odd");
        }
    }
}
