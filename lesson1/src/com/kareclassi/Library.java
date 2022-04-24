package com.kareclassi;

import java.util.Scanner;

public class Library {
    public void borrow(){
        System.out.println("enter the name of the book that you want to borrow: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("book is borrowed.");
    }
    public void getBack(){
        System.out.println("enter the name of the book that you want to get back: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("done.");
    }
}
