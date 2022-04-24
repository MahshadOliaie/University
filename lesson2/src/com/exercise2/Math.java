package com.exercise2;

public class Math implements Lesson{
    String name="riazi 2";
    int vahed=3;
    String pish="riazi 1";
    String ham= "hamniaz nadarad.";

    @Override
    public void pish(){
        System.out.println(pish);
    }

    @Override
    public void ham(){
        System.out.println(ham);
    }

    @Override
    public void vahed(){
        System.out.println(vahed);
    }
}
