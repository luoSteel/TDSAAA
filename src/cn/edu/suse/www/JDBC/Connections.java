package cn.edu.suse.www.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connections 
{
	public static Connection getDBConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/tdsaaa";
            String user = "root";
            String password = "luogang";
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
        	System.out.println("找不到驱动程序类 ，加载驱动失败！");
            e.printStackTrace();
        } catch (SQLException e) {
        	System.out.println("数据库连接失败！");
			e.printStackTrace();
		}
 
        return conn;
    }

}
