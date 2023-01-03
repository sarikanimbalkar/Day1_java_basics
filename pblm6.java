package com.bridgelabz;

public class pblm6 {
    static int Result=0;

    static void add(int a, int b)
    {
        Result=a+b;
        System.out.println("Addition is : " + Result);
    }
    static void sub(int a, int b)
    {
        Result=a-b;
        System.out.println("Substraction  is : " + Result);
    }
    static void mul(int a, int b)
    {
        Result=a*b;
        System.out.println("Multification  is : " + Result);
    }
    static void div(int a, int b)
    {
        Result=a/b;
        System.out.println("Division is : " + Result);
    }
    public static void main(String args[])
    {
        System.out.println("Initial Result value is: " + Result);
        add(10,10);
        sub(25,5);
        mul(5,30);
        div(20,2);
    }
}
