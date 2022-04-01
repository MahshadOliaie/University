package com.exercise2;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter your username: ");
        String userName= input.nextLine();
        System.out.println("enter your password (number): ");
        String password = input.nextLine();
        int pass = Integer.parseInt(password);
        System.out.println("enter your phone number: ");
        String number= input.nextLine();

        User <Integer,String> user1=new User<>();
        user1.setUser(userName);
        user1.setPass(pass);
        user1.setNumber(number);
        User<Integer,String> user2=user1.clone();
        User<Integer,String> user3=user1.clone();

        System.out.println("user1 -"+ "user name: "+ user1.getUser()+"/ password: "+ user1.getPass()+"/ number: "+user1.getNumber());
        System.out.println("user2 -"+ "user name: "+ user2.getUser()+"/ password: "+ user2.getPass()+"/ number: "+user2.getNumber());
        System.out.println("user3 -"+ "user name: "+ user3.getUser()+"/ password: "+ user3.getPass()+"/ number: "+user3.getNumber());

    }
}
