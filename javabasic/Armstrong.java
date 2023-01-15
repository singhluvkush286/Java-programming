package javabasic;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to check Armstrong number");
        int a = in.nextInt();
       // int b = in.nextInt();
        int temp, digit = 0, sum = 0;
        int last;
       // for (int i = a; i<b; i++) {
            temp = a;
            while (temp != 0) {
                temp /= 10;
                digit++;
            }
            temp = a;
            while (temp != 0) {
                last = temp % 10;
                sum += (Math.pow(last, digit));
                temp /= 10;
            }
            if (sum == a) {
                System.out.println(a + " is the Armstrong number");
            }



    }

}
