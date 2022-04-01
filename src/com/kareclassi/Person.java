package com.kareclassi;

public class Person {
    private String Name;
    private String Family;
    private int Age;
    private String Pass;
    private String Username;
    private String Job;

    public String getName() {
        return Name;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getFamily() {
        return Family;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }

    public void setFamily(String family) {
        Family = family;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}


