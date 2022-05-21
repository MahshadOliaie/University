package com.exercise2;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Model db = new Model();
        System.out.println("welcome to saipa app");
        System.out.println("our cars : ");
        db.printAllCarsName();
        System.out.println("please type car name : ");
        String carName = new Scanner(System.in).nextLine();
        System.out.println(carName + " price is : "+ db.getCarPriceByName(carName) + "T");
    }

}
