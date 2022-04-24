package com.exercise3;
import com.exercise1.UserException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserException {
        Scanner input= new Scanner(System.in);
        System.out.print("jomle ra vared konid: ");
        String jomle=input.nextLine();
        for (int i=0; i<=10; i++) {
            String s = Integer.toString(i);
            if (jomle.contains(s)) {
                throw new UserException("jomle shoma shamel adad ast!");
            }
        }
            System.out.println("toole jomle shoma: "+jomle.length());
        }
    }

