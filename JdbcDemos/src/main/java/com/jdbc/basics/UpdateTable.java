package com.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateTable {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/voyaTraining";
        String username="root";
        String password="root";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();
            String sql = "update table employee;";

            boolean result = statement.execute(sql);
            System.out.println("Update" + !result);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
