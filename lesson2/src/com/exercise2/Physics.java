package com.exercise2;

public class Physics implements Lesson{
    String name="fizik 2";
    int vahed=3;
    String pish="fizik 1";
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
