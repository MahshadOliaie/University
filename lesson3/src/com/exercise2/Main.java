package com.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DeltaException {
        Scanner input=new Scanner(System.in);
        System.out.print("zarib x2: ");
        float zx2=input.nextFloat();
        System.out.print("zarib x: ");
        float zx=input.nextFloat();
        System.out.print("c: ");
        float zc=input.nextFloat();
        System.out.println("moadele:  y="+zx2+"x^2+"+zx+"x+"+zc);

        Delta delta=new Delta(zx2,zx,zc);
        if(delta.delta()<0){
            throw new DeltaException("moadele javab nadarad.");
        }
        if(delta.delta()==0)
            System.out.println("javab moadele: "+ (-zx)/(2*zx2));
        if (delta.delta()>0)
            System.out.println("javab haye moadele: "+ (-zx + Math.sqrt(delta.delta()))/2*zx2);
        System.out.println("javab haye moadele: "+ (-zx - Math.sqrt(delta.delta()))/2*zx2);

    }
}
