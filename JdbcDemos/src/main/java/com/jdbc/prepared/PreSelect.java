package com.jdbc.prepared;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class PreSelect {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/voyaTraining";
        String username="root";
        String password="root";
        String sql="select * from cab";
        try
                (Connection connection = DriverManager.getConnection(url, username, password);
                 PreparedStatement statement= connection.prepareStatement(sql);
                 ResultSet resultSet=statement.executeQuery(sql);
                ){




            while (resultSet.next()){
               int cabNumber= resultSet.getInt("cab_number");
               String driverName=resultSet.getString("driver_name");
                String pickLoc=resultSet.getString("pickup_loc");
               String dropLoc =resultSet.getString("drop_loc");
               Time time=resultSet.getTime("pickup_time");
                LocalTime localTime=LocalTime.parse(time.toString());
                LocalDate localDate=LocalDate.parse(resultSet.getDate("pickup_date").toString());
                System.out.println(cabNumber+"\t"+driverName+"\t"+pickLoc+"\t"+dropLoc);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }


    }
}
