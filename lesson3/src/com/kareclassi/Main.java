package com.kareclassi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserException {
        Scanner input=new Scanner(System.in);
        System.out.println("User 1: ");
        System.out.print("enter your name: ");
        String name1= input.nextLine();
        System.out.print("enter your family: ");
        String family1=input.nextLine();
        System.out.print("enter your age: ");
        String agee1 =input.nextLine();
        int age1 =Integer.parseInt(agee1);
        User user1=new User(name1,family1,age1);

        System.out.println("User 2: ");
        System.out.print("enter your name: ");
        String name2= input.nextLine();
        System.out.print("enter your family: ");
        String family2=input.nextLine();
        System.out.print("enter your age: ");
        String agee2=input.nextLine();
        int age2 =Integer.parseInt(agee2);
        User user2=new User(name2,family2,age2);

        User[] users={user1,user2};
        if(users[0].name.equals(users[1].name) && users[0].family.equals(users[1].family) && users[0].age==users[1].age){
            throw new UserException("in karbar tekrari ast.");
        }
        else
            System.out.println("done.");



    }
}
