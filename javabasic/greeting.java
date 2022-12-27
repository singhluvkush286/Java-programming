package javabasic;

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    System.out.println("enter the name to greet");
    String name = input.nextLine();
    System.out.println("Hello !! "+ name);
}
}
