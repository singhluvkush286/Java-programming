package Condition_loop;

import java.util.Scanner;

public class largest_among_all {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max=0;
        System.out.println("Enter the number to start the loop :");
        while(true){
            int n=in.nextInt();
            if(max<n){
                max=n;
            }
            if(n==0){
                break;
            }

        }
        System.out.print("maximum among all is "+max);
    }
}
