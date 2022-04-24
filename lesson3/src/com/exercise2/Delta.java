package com.exercise2;

public class Delta {
    float zx2;
    float zx;
    float zc;
    public Delta(float zx2,float zx,float zc){
        this.zc=zc;
        this.zx=zx;
        this.zx2=zx2;
    }

    public float delta(){
        float delta=( zx*zx - (4*zx2*zc));
        return delta;
    }
}
