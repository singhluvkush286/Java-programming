package javabasic;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String origin , reverse ="";
        origin = input.nextLine();
        int len = origin.length();
        for(int i=len-1;i>=0;i--){
            reverse = reverse + origin.charAt(i);
        }

        if(origin.equals(reverse)){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("string is not palindrome");
        }
        System.out.println(reverse);
        
    }
}
