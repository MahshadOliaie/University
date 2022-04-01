package com.exercise1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map stuMap = new HashMap();
        Scanner input= new Scanner(System.in);
        System.out.println("enter your name: ");
        String name = input.nextLine();
        System.out.println("enter your student number: ");
        String stuNum = input.nextLine();
        System.out.println("enter your average score: ");
        String avg = input.nextLine();
        Float avgScore = Float.parseFloat(avg);
        Student student= new Student();
        student.setName(name);
        student.setStuNum(stuNum);
        student.setAvgScore(avgScore);

        stuMap.put("name",student.getName());
        stuMap.put("student number", student.getStuNum());
        stuMap.put("average score", student.getAvgScore());

        System.out.println("name: "+ stuMap.get("name"));
        System.out.println("student number: "+ stuMap.get("student number"));
        System.out.println("average score: "+ stuMap.get("average score"));
    }
}

