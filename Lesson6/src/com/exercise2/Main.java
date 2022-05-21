package com.exercise2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Employee employee=new Employee();
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/L6","root","Mahshad@9224140386");
        Scanner reader=new Scanner(System.in);
        String action;
        System.out.print("what do you want to do ");
        action=reader.nextLine();
        switch (action)
        {
            case "Create":
                PreparedStatement preparedStatement= connection.prepareStatement("insert into homework2(id,Name,National_Number,Father_Name,Position,Salary,Work_Experiance )values (?,?,?,?,?,?,?)");
                System.out.print("Enter Id:");
                employee.setId(Integer.parseInt(reader.nextLine()));
                System.out.print("Enter name:");
                employee.setName(reader.nextLine());
                System.out.print("Enter National Number");
                employee.setNational_number(reader.nextLine());
                System.out.print("Enter Father's Name");
                employee.setFather(reader.nextLine());
                System.out.print("Enter Position");
                employee.setPosition(reader.nextLine());
                System.out.print("Enter Salary");
                employee.setSalary(Integer.parseInt(reader.nextLine()));
                System.out.print("Enter the work experience");
                employee.setHistory(reader.nextLine());
                preparedStatement.setInt(1,employee.getId());
                preparedStatement.setString(2,employee.getName());
                preparedStatement.setString(3,employee.getNational_number());
                preparedStatement.setString(4, employee.getFather());
                preparedStatement.setString(5, employee.getFather());
                preparedStatement.setInt(6, employee.getSalary());
                preparedStatement.setString(7, employee.getHistory());
                preparedStatement.executeUpdate();
                connection.close();
                System.out.print("Created......");
                break;
            case "Delete":
                PreparedStatement preparedStatement1= connection.prepareStatement("delete from homework2 where Id=?");
                System.out.print("Enter Id");
                employee.setId(Integer.parseInt(reader.nextLine()));
                preparedStatement1.setInt(1,employee.getId());
                preparedStatement1.executeUpdate();
                connection.close();
                System.out.print("Deleted.....");
                break;
        }

    }
}