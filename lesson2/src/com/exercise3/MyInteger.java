package com.exercise3;

public class MyInteger implements IMyInteger {
    public int num;

    public MyInteger(int num) {
        this.num = num;
    }

    @Override
    public boolean isEven(int num) {
        if (isZero(num) == false) {
            if (num % 2 == 0) {
                System.out.println("it's Even. ");
                return true;
            } else {
                System.out.println("it's not Even.");
                return false;
            }
        } else {
            System.out.println("it's not Even.");
            return false;
        }
    }

    @Override
    public boolean isPositive(int num) {
        if (num >= 0) {
            System.out.println("it's positive.");
            return true;
        } else {
            System.out.println("it's not positive.");
            return false;
        }
    }

    @Override
    public boolean isNegative(int num) {
        if (num < 0) {
            System.out.println("it's negative.");
            return true;
        } else {
            System.out.println("it's not negative.");
            return false;
        }
    }

    @Override
    public boolean isZero(int num) {
        if (num == 0) {
            System.out.println("it's zero.");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isOdd(int num) {
        if (isZero(num) == false) {
            if (num % 2 != 0) {
                System.out.println("it's Odd. ");
                return true;
            } else {
                System.out.println("it's not Odd.");
                return false;
            }
        } else {
            System.out.println("it's not Odd.");
            return false;
        }
    }



}

