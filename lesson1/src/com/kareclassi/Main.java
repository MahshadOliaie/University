package com.kareclassi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello. please choose one number:");
        System.out.println("1: borrow a book.");
        System.out.println("2: get back the book.");
        String number= new Scanner(System.in).nextLine();
        int num = Integer.parseInt(number);
        Library library= new Library();
        switch (num){
            case 1:
                library.borrow();
                break;
            case 2:
                library.getBack();
                break;
            default:
                System.out.println("incorrect number!");
        }
    }
}
