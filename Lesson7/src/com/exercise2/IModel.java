package com.exercise2;

import java.sql.SQLException;

public interface IModel {
    void printAllCarsName () throws SQLException;
    int getCarPriceByName(String name) throws SQLException;
}