package com.exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("moadele 1:");
        System.out.print("zarib x: ");
        float a=input.nextFloat();
        System.out.print("zarib y: ");
        float b=input.nextFloat();
        System.out.print("javabe moadele: ");
        float e=input.nextFloat();
        Math moadele1=new Math(a,b,e);

        System.out.println("moadele 2:");
        System.out.print("zarib x: ");
        float c=input.nextFloat();
        System.out.print("zarib y: ");
        float d=input.nextFloat();
        System.out.print("javabe moadele: ");
        float f=input.nextFloat();
        Math moadele2=new Math(c,d,f);

        System.out.println("moadele 1: "+a+"x+"+b+"y="+e);
        System.out.println("moadele 2: "+c+"x+"+d+"y="+f);

        Math.solve(moadele1.zx,moadele1.zy,moadele1.anw,moadele2.zx,moadele2.zy,moadele2.anw);

    }
}

