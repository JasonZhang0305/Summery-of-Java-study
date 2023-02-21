package com.zzj;

import java.sql.*;

public class resultset_ {
    public static void main(String[] args) {
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String sql = "";
        ResultSet resultSet = statement.executeQuery(sql);
//        源码
//        while循环取出
        while(resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String sex = resultSet.getString(3);
            Date date = resultSet.getDate(4);
            System.out.println(id + name + sex + date);
        }
        resultSet.close();
        statement.close();
        connection.close();

    }

}
