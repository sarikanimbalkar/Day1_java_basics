package com.bridgelabz;

import java.util.Scanner;
public class pblm4 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int a=sc.nextInt();
        System.out.println("Enter num2 : ");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum of two number is : " + sum );
        /*int cnt=0;
        if(a<0)
        {
            cnt++;
            System.out.println("wrong integer entered = " + cnt + " times");
        }*/
    }
}
