package edu.kh.jdbc.common;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCTemplate {
	
	private static Connection conn = null;
	
	public static Connection getConnection() {
		
		try {
			if(conn == null || conn.isClosed()) {
			
			Properties prop = new Properties();
			prop.loadFromXML(new FileInputStream("driver.xml"));
			
			String driver = 
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
		
	}
	
	
}
