package com.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("choose a lesson( fizik 2, riazi 2 ): ");
        String lesson = input.nextLine();

        switch (lesson){
            case "riazi 2":
                Math math=new Math();
                System.out.print("pish niaz: ");
                math.pish();
                System.out.print("ham niaz: ");
                math.ham();
                System.out.print("vahede dars: ");
                math.vahed();
                break;
            case "fizik 2":
                Physics physics=new Physics();
                System.out.print("pish niaz: ");
                physics.pish();
                System.out.print("ham niaz: ");
                physics.ham();
                System.out.print("vahede dars: ");
                physics.vahed();
                break;
            default:
                System.out.println("wrong lesson!");

        }
    }
}
