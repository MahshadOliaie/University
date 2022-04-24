package com.exercise1;

import java.util.Scanner;

public class Main {
    private static final String name1="Mahshad";
    private static final String userName1="MahshadOliaie";
    private static final String passWord1="1234";

    public static void main(String[] args) throws UserException {
        Scanner input=new Scanner(System.in);
        System.out.print("enter your name: ");
        String name=input.nextLine();
        System.out.print("enter your Username: ");
        String userName=input.nextLine();
        System.out.print("enter your password: ");
        String passWord= input.nextLine();

        if(!name.equals(name1) || !userName.equals(userName1) || !passWord.equals(passWord1)){
            throw new UserException("Wrong data!!");
        }
        else {
            System.out.println("done.");
        }
    }
}
