package com.jdbc.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreCreate {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/voyaTraining";
        String username="root";
        String password="root";
        String sql= "create table cab(cab_number int primary key, drop_loc varchar(20), " +
                "pickup_loc varchar(20),pickup_time time, pickup_date date, driver_name varchar(20))";
        try
                (Connection connection = DriverManager.getConnection(url, username, password);
                 PreparedStatement statement= connection.prepareStatement(sql)

                ){
            boolean result =statement.execute();
            System.out.println(result);


        }catch(Exception e){
           e.printStackTrace();
        }
    }
}
