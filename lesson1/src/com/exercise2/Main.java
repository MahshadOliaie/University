package com.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float sum=0;
        int counter=0;
        System.out.println("enter your grade or -1 to quit: ");
        float grade=input.nextFloat();
        while (grade !=-1){
            System.out.println("enter the coefficient: ");
            int coe=input.nextInt();
            float num=coe*grade;
            if(grade>=10){
                sum+=num;
            }
            else{
                System.out.println("you are failed this course.");
            }
            System.out.println("enter your grade or -1 to quit: ");
            grade=input.nextFloat();
            counter+=coe;
        }
        Course course=new Course(sum,counter);
        System.out.println("your average is: "+ course.sum/course.counter);

    }
}
