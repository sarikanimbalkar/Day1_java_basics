package com.bridgelabz;

import java.util.Scanner;

public class pblm7 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int yr=sc.nextInt();
        if ( yr%4 == 0 ) {
            System.out.println( yr + " This Year is Leap Year... ");
        }
        else
            System.out.println( yr + " This Year is not  Leap Year... ");

    }
}
