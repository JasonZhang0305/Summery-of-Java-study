package com.zzj;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class jdbc01 {
    public static void main(String[] args) throws SQLException {
//        前置工作：在项目下创建一个文件夹，比如libs
//        将mysql.jar 拷贝到该目录下，点击add to project 加入到项目中
//        1 注册驱动
        Driver driver = new Driver();
//        2 得到连接
//        jdbc:mysql:/表示协议，通过jdbc的方式连接mysql
//        localhost主机， 也可以是其他ip
//        3306 表示mysql监听的端口
//        db03表示要链接到的数据库
//        mysql连接的本质就是网络连接
        String url = "jdbc:mysql://localhost:3306/db03";
//        将用户名和密码放入到Properties对象
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "123456");
        Connection connect = driver.connect(url, properties);
//        3 执行sql
        String sql = "insert into actor values(null, 'zzj', '1999', '110')";
//         创建一个statement 用于执行静态SQL语句并返回其生成的结果对象
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql); //如果是dml语句，返回的就是影响行数
        System.out.println(rows > 0 ? "suc" : "fal");
//        关闭连接资源
        statement.close();
        connect.close();


    }
}
