package com.zzj;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

public class DruidDemo {
    public static void main(String[] args) {
        /*数据库连接池就是一个存放数据库连接的容器
         *当系统初始化好之后，就会创建一些连接对象，当用户来访问时，只需从容器中获取连接对象
         * 用户访问完之后，将连接自动归还连接池
         * 好处：节省资源，高效连接
         */
        //1 导入jar包
        //2 定义配置文件：连接的初始个数，最大个数，等待时间
        //3 加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("url"));
        //4 获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.craeteDataSource(prop);
        //5 获取数据库连接 Connection
        Connection connection = dataSource.getConnection();
        //归还连接
        connection.close();
    }
}
