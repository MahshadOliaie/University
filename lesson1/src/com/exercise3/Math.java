package com.exercise3;

public class Math {
    public float zx;
    public float zy;
    public float anw;
    public Math(float zx, float zy, float anw){
        this.zx=zx;
        this.zy=zy;
        this.anw=anw;
    }

    public static void solve(float a,float b, float e, float c, float d, float f){
        float x= (e*d-b*f)/(a*d-b*c);
        float y=(a*f-e*c)/(a*d-b*c);
        if(x==0&y==0){
            System.out.println("moadele hal nemishavd!");

        }
        else {
            System.out.println("x="+x);
            System.out.println("y="+y);
        }
    }
}
