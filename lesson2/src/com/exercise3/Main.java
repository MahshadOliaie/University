package com.exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter your number: ");
        int num=input.nextInt();
        MyInteger myInteger=new MyInteger(num);

        myInteger.isEven(num);
        myInteger.isOdd(num);
        myInteger.isNegative(num);
        myInteger.isPositive(num);
        myInteger.isZero(num);

    }
}
