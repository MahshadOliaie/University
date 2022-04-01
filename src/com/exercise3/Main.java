package com.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter your name: ");
        String name = input.nextLine();
        System.out.println("enter your student number: ");
        String stuNum = input.nextLine();
        System.out.println("enter your father's name: ");
        String fmane = input.nextLine();
        System.out.println("enter your score: ");
        String n1=input.nextLine();
        System.out.println("enter your score: ");
        String n2=input.nextLine();
        System.out.println("enter your score: ");
        String n3=input.nextLine();
        System.out.println("enter your score: ");
        String n4=input.nextLine();
        System.out.println("enter your score: ");
        String n5=input.nextLine();

        Daneshjoo daneshjoo=new Daneshjoo();
        daneshjoo.setNum1(n1);
        daneshjoo.setNum2(n2);
        daneshjoo.setNum3(n3);
        daneshjoo.setNum4(n4);
        daneshjoo.setNum5(n5);
        daneshjoo.setName(name);
        daneshjoo.setFname(fmane);
        daneshjoo.setStuNum(stuNum);
        System.out.println("name: "+daneshjoo.getName());
        System.out.println("student number: "+daneshjoo.getStuNum());
        System.out.println("father's name: "+daneshjoo.getFname());

        List<String> list=new ArrayList<>();
        list.add(daneshjoo.getNum1());
        list.add(daneshjoo.getNum2());
        list.add(daneshjoo.getNum3());
        list.add(daneshjoo.getNum4());
        list.add(daneshjoo.getNum5());
        System.out.println("scores: ");
        for (String s : list){
            System.out.println(s);
        }
    }
}
