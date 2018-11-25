package com.jdbc_programs;

import java.sql.*;
import java.util.Scanner;

public class JDBC_Ques1 {
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/Students";

   static final String USER = "root";
   static final String PASS = "sharma8388";
   
   public static void main(String[] args) throws SQLException{
	   Connection conn = null;
	   Statement stmt = null;
	   int option = 0;
	   String sql;
	   ResultSet rs = null;
	   
	   Scanner sc = new Scanner(System.in);
	   
	   try {
		   Class.forName("com.mysql.jdbc.Driver");
			
		      System.out.println("Connecting to DataBase...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		
		      System.out.println("Creating Statement...");
		      stmt = conn.createStatement();
		      
	   } catch (Exception e) {
		   e.printStackTrace();
	   }
	   
	   do {
		   
		   System.out.println("JDBC");
		   System.out.println("1. Total Number of Students");
		   System.out.println("2. Average Marks for a Subject");
		   System.out.println("3. Highest Scoring Student");
		   System.out.println("4. Number of Students in Top 3 Divisions");
		   System.out.println("5. Subject wise Toppers");
		   System.out.println("6. Average Marks");
		   System.out.println("7. Student with 2nd Highest Marks");
		   
		   System.out.print("\n:(To Exit -1) :: ");
		   option = sc.nextInt();
		   
		   System.out.println();
		   
		   switch(option) {
		   		case 1:
		   			sql = "SELECT COUNT(*) as Number_of_Students FROM Student";
		   			rs = stmt.executeQuery(sql);
		   			
		   			while (rs.next()) {
		   				int total_count = rs.getInt("Number_of_Students");
		   				System.out.println("Total Number of Students: " + total_count + "\n");
		   			}
		   			
		   			rs.close();
		   			break;
		   		case 2:
		   			System.out.print("Enter Subject (English, Hindi, Maths, SST, Science): ");
		   			String sub = sc.next();
		   			
		   			sql = "SELECT AVG(Marks) as avg_marks FROM Result WHERE Subject = \""+sub+"\"";
		   			rs = stmt.executeQuery(sql);
		   			
		   			while (rs.next()) {
		   				int avg_marks = rs.getInt("avg_marks");
		   				System.out.println("Average Marks in " + sub + ": " + avg_marks + "\n");
		   			}
		   			
		   			rs.close();
		   			break;
		   		case 3:
		   			sql = "SELECT Name, MAX(R.avg_marks) as Total FROM Student S, (SELECT S_ID, AVG(Marks) as avg_marks FROM Result GROUP BY S_ID) R WHERE S.ID = R.S_ID";
		   			rs = stmt.executeQuery(sql);
		   			
		   			while (rs.next()) {
		   				String name = rs.getString("Name");
		   				int total_marks = rs.getInt("Total");
		   				System.out.println("Name: " + name + "\t" + "Marks: " + total_marks + "\n");
		   			}
		   			
		   			rs.close();
		   			break;
		   		case 4:
		   			
		   			int student_count = 0;
		   			
		   			sql = "SELECT COUNT(*) as first FROM Student S, (SELECT S_ID, AVG(Marks) as avg_marks FROM Result GROUP BY S_ID) R WHERE S.ID = R.S_ID AND (R.avg_marks > 82)";
		   			
		   			rs = stmt.executeQuery(sql);
		   			
		   			while (rs.next()) {
		   				student_count = rs.getInt("first");
		   				System.out.println("Number of Student getting First Division: " + student_count);
		   			}
		   			
		   			rs.close();
		   			
		   			sql = "SELECT COUNT(*) as second FROM Student S, (SELECT S_ID, AVG(Marks) as avg_marks FROM Result GROUP BY S_ID) R WHERE S.ID = R.S_ID AND (R.avg_marks BETWEEN 78 AND 82)";
		   			
		   			rs = stmt.executeQuery(sql);
		   			
		   			while (rs.next()) {
		   				student_count = rs.getInt("second");
		   				System.out.println("Number of Student getting Second Division: " + student_count);
		   			}
		   			
		   			rs.close();
		   			
		   			sql = "SELECT COUNT(*) as third FROM Student S, (SELECT S_ID, AVG(Marks) as avg_marks FROM Result GROUP BY S_ID) R WHERE S.ID = R.S_ID AND (R.avg_marks <= 78)";
		   			
		   			rs = stmt.executeQuery(sql);
		   			
		   			while (rs.next()) {
		   				student_count = rs.getInt("third");
		   				System.out.println("Number of Student getting Third Division: " + student_count + "\n");
		   			}
		   			
		   			rs.close();
		   			break;
		   		case 5:
		   			sql = "SELECT Subject, Name FROM Student S, (SELECT S_ID, Max(Marks), Subject FROM Result GROUP BY Subject) R WHERE S.ID = R.S_ID";
		   			
		   			rs = stmt.executeQuery(sql);
		   			
		   			String subj, name;
		   			
		   			while (rs.next()) {
		   				subj = rs.getString("Subject");
		   				name = rs.getString("Name");
		   				
		   				System.out.println("Subject: " + subj + "\t\t" + "Student: " + name);
		   			}
		   			
		   			System.out.println();
		   			
		   			rs.close();
		   			
		   			break;
		   		case 6:
		   			sql = "SELECT AVG(Marks) as avg_marks FROM Result";
		   			rs = stmt.executeQuery(sql);
		   			
		   			while (rs.next()) {
		   				int avg_marks = rs.getInt("avg_marks");
		   				System.out.println("Average Marks: " + avg_marks + "\n");
		   			}
		   			
		   			rs.close();
		   			break;
		   		case 7:
		   			sql = "SELECT Name FROM Result R INNER JOIN Student S ON R.S_ID=S.ID GROUP BY S.ID ORDER BY SUM(Marks) DESC LIMIT 1,1";
		   			
		   			rs = stmt.executeQuery(sql);
		   			
		   			while (rs.next()) {
		   				String name1 = rs.getString("Name");
		   				System.out.println("Student with 2nd Highest Marks: " + name1 + "\n");
		   			}
		   			
		   			rs.close();
		   			break;
		   		default:
		   			System.out.println("");
		   }
		   
	   } while (option != -1);
	   
		rs.close();
		stmt.close();
		
		System.out.println("Closing Connection...");
		conn.close();
	   
		System.out.println("Closed.");
   }
}
