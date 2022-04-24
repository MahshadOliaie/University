package com.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter number 1: ");
        float num1= input.nextFloat();
        System.out.print("enter number 2: ");
        float num2= input.nextFloat();
        Calculator calculator=new Calculator(num1,num2);

        System.out.println("Sum is: "+ calculator.sum());
        System.out.println("Minus is: "+ calculator.minus());
        System.out.println("Multiple is: "+ calculator.multiple());
        System.out.println("Divide is: "+ calculator.divide());
    }
}
