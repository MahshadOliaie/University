package com.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter height: ");
        float height= input.nextFloat();
        System.out.print("enter length: ");
        float length=input.nextFloat();
        if(length==height){
            Square square= new Square();
            square.square(height,length);
        }
        else {
            Rec rect=new Rec();
            rect.rec(height,length);
        }
    }
}
