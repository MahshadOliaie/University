package com.exercise2;

public class User<I , S> implements Cloneable {
    private S user;
    private I pass;
    private S number;

    public S getUser(){
        return user;
    }

    public void setUser(S user) {
        this.user = user;
    }

    public I getPass() {
        return pass;
    }

    public void setPass(I pass) {
        this.pass = pass;
    }

    public S getNumber() {
        return number;
    }

    public void setNumber(S number) {
        this.number = number;
    }
    @Override
    public User<I,S> clone(){
        try {
            User clone= (User) super.clone();
            return clone;
        }
        catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}
