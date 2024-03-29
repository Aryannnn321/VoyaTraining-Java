package com.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertTable {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/voyaTraining";
        String username="root";
        String password="root";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();
            String sql = "Insert into employees values('Priya', 1, 'Banglore')";
            boolean result = statement.execute(sql);
            System.out.println("Data Inserted" + !result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
