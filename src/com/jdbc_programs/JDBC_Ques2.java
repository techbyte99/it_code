package com.jdbc_programs;

import java.sql.*;
import java.util.Scanner;

public class JDBC_Ques2 {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/Students";

   static final String USER = "root";
   static final String PASS = "sharma8388";

	public static void main(String[] args) throws SQLException{
		Connection conn = null;
		CallableStatement stmt = null;
		String sql;
		int result;
	   
	   Scanner sc = new Scanner(System.in);
	   
	   try {
		   Class.forName("com.mysql.jdbc.Driver");
	
		  System.out.println("Connecting to DataBase...");
		  conn = DriverManager.getConnection(DB_URL, USER, PASS);
		
		  System.out.println("Creating Statement...");
		  
		  sql = "{CALL getCount(?)}";
	      stmt = conn.prepareCall(sql);
	      
	      stmt.registerOutParameter(1,  java.sql.Types.INTEGER);
	      stmt.execute();
	      
	      result = stmt.getInt(1);
	      
	      System.out.println("Total Number of Students: " + result);
	      
	      stmt.close();
	      conn.close();
		      
	   } catch (Exception e) {
		   e.printStackTrace();
	   }

	}

}
