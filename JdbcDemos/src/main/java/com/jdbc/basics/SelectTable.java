package com.jdbc.basics;

import java.sql.*;

public class SelectTable {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/voyaTraining";
        String username="root";
        String password="root";
        try
                (Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();){
            String sql= "select *from employees";
            ResultSet resultSet=statement.executeQuery(sql);
            while (resultSet.next()){
                String name= resultSet.getString("name");
                int employeeId =resultSet.getInt("employeeId");
                String city = resultSet.getString("city");
                System.out.println(name+"\t"+employeeId+"\t"+city);
            }
        }catch (Exception e){

        }
    }
}
