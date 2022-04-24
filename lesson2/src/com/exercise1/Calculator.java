package com.exercise1;

public class Calculator implements Cal {
    float num1;
    float num2;
    public Calculator(float num1, float num2){
        this.num1=num1;
        this.num2=num2;
    }
    @Override
    public float sum(){
        float sum=num1+num2;
        return sum;
    }
     @Override
    public float multiple(){
        float multiple= num1*num2;
        return multiple;
     }

    @Override
    public float minus(){
        float minus= num1-num2;
        return minus;
    }

    @Override
    public float divide(){
        float divide= num1/num2;
        return divide;
    }
}
