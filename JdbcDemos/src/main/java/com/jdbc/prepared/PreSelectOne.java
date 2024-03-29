package com.jdbc.prepared;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class PreSelectOne {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyaTraining";
        String username = "root";
        String password = "root";
        String sql = "select * from cab where dropLoc=?";
        try
                (Connection connection = DriverManager.getConnection(url, username, password);
                 PreparedStatement statement= connection.prepareStatement(sql);
                 ResultSet resultSet=statement.executeQuery(sql);
                ){

                    statement.setString(1,"hbr");

                    try (ResultSet resultSet1=statement.executeQuery()) {

                    }

            while (resultSet.next()){
                int cabNumber= resultSet.getInt("cabNumber");
                String driverName=resultSet.getString("driverName");
                String pickLoc=resultSet.getString("pickLoc");
                String dropLoc =resultSet.getString("dropLoc");
                Time time=resultSet.getTime("pickupTime");
                LocalTime localTime=LocalTime.parse(time.toString());
                LocalDate localDate=LocalDate.parse(resultSet.getDate("pickupDate").toString());

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
