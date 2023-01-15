package Condition_loop;

import java.util.Scanner;

public class Factor_of_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] factor=new int[100];
        System.out.println("Enter the number to get factor of :");
        int num = in.nextInt();
        int j=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                factor[j]=i;
                j++;
            }
        }
        System.out.println("The factor of "+num+" are :");
        for(int i=0;i<j;i++){
            System.out.print(factor[i]+" ");
        }
    }
}
