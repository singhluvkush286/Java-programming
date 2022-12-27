package Introductontojava;

import java.util.Scanner;

public class LcmHcf {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int num1 = input.nextInt();
        System.out.println("Enter Second Number :");
        int num2 = input.nextInt();
        int temp1,temp2,temp,hcf,lcm;
        temp1=num1;
        temp2=num2;
        while(temp2!=0){
            temp=temp2;
            temp2=temp1%temp2;
            temp1=temp;
        }
        hcf=temp1;
        lcm=(num1*num2)/hcf;
        System.out.println("HCF of number is " +hcf);
        System.out.println("LCM of number is "+lcm);

    }
}
