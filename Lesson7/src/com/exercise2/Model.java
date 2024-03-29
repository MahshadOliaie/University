package com.exercise2;

import java.sql.*;
import java.util.List;

public class Model implements IModel{
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/L6","Mahshad","Mahshad@9224140386");
    Statement statement = connection.createStatement();

    public Model() throws SQLException {
    }


    @Override
    public void printAllCarsName() throws SQLException {
        for (int id = 1; id <= 10 ; id++) {
            ResultSet resultSet1 = statement.executeQuery(String.format("SELECT car_name from saipa  WHERE id = '%s';", id));
            while (resultSet1.next())
            {
                String name  = resultSet1.getString(1);
                System.out.println(name);
            }

        }

    }

    @Override
    public int getCarPriceByName(String name) throws SQLException {
        ResultSet resultSet1 = statement.executeQuery(String.format("SELECT car_price from saipa  WHERE car_name = '%s';", name));
        while (resultSet1.next())
        {
            int price = resultSet1.getInt(1);
            return price;
        }

        return 0;
    }
}
