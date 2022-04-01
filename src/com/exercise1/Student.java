package com.exercise1;

public class Student {
    private String stuNum;
    private String name;
    private float avgScore;

    public String getStuNum(){
        return stuNum;
    }
    public void setStuNum(String stuNum){
        this.stuNum=stuNum;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public float getAvgScore(){
        return avgScore;
    }

    public void setAvgScore(float avgScore) {
        this.avgScore = avgScore;
    }
}
