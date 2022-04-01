package com.kareclassi;

import java.util.Scanner;

public class MainClass {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("enter your name: ");
            String name = input.nextLine();
            System.out.println("enter your family: ");
            String family = input.nextLine();
            System.out.println("enter your username: ");
            String user = input.nextLine();
            System.out.println("enter your password: ");
            String pass = input.nextLine();
            System.out.println("enter your job: ");
            String job = input.nextLine();
            System.out.println("enter your age: ");
            int age = input.nextInt();
            Person p1=new Person();
            p1.setName(name);
            p1.setFamily(family);
            p1.setUsername(user);
            p1.setPass(pass);
            p1.setAge(age);
            p1.setJob(job);
            System.out.println("name: "+p1.getName());
            System.out.println("family: "+p1.getFamily());
            System.out.println("username: "+p1.getUsername());
            System.out.println("password: "+p1.getPass());
            System.out.println("age: "+p1.getAge());
            System.out.println("job: "+p1.getJob());
        }
    }

