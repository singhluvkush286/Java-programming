package Condition_loop;

import java.util.Scanner;

public class addition_until_input_0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number to start the loop :");
        while(true){
            int n=in.nextInt();
            sum+=n;
            if(n==0){
                break;
            }

        }
        System.out.print("sum is "+sum);
    }
}

