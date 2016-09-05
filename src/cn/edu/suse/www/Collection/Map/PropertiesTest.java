package cn.edu.suse.www.Collection.Map;

import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) {
		Properties p = new Properties();
		
		p.setProperty("url", "jdbc:mysql://localhost:3306/cloudnote?useUnicode=true&characterEncoding=utf-8");
		p.setProperty("driver", "com.mysql.jdbc.Driver");
		p.setProperty("user", "root");
		p.setProperty("password", "luogang");
		
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("driver"));
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
		
	}
}
