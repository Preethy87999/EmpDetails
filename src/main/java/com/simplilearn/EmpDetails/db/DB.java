package com.simplilearn.EmpDetails.db;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.simplilearn.EmpDetails.model.Worker;

public class DB implements DAO{
	
	Connection connection;
	PreparedStatement preparedstatement;
	public DB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. Driver Loaded...");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public void createConnection() {
		try {
		    String user="preethi";
		    String password="Preethi#3";
		    String database ="employee";
		    
		    String url="jdbc:mysql://localhost/"+database;
		    
		    connection = DriverManager.getConnection(url, user, password);
		    System.out.println("2. Connection Created....");
		    } catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	public void closeConnection() {
		try {
			if(connection!=null) {
				connection.close();
			    System.out.println("2. Connection Close....");
			}else {
				System.err.println("2. Connection doesnot exist....");
			}
		    
		    } catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	public void createWorker(Worker workers) {
		try {
			
			String sql="insert into Worker value(null,?,?,?,?,?)";
			preparedstatement = connection.prepareStatement(sql);
			
			BufferedReader inp = new BufferedReader (new InputStreamReader
					(System.in));
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Name");
			String a =sc.nextLine();
			System.out.println("Enter Phnone Number");
			String b =sc.nextLine();
			System.out.println("Enter Age");
			int c =sc.nextInt();
			System.out.println("Enter Experience");
			int d =sc.nextInt();
			System.out.println("Enter Salary");
			String e =inp.readLine();
			
				preparedstatement.setString(1,a);
				preparedstatement.setString(2, b);
				preparedstatement.setInt(3,c );
				preparedstatement.setInt(4, d);
				preparedstatement.setString(5,e);
				preparedstatement.addBatch();
				int[] count = preparedstatement.executeBatch();
			
			 System.out.println("Records inserted......");
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

	public List<Worker> getAllWorkers() {
		
		List<Worker> workers = new ArrayList<Worker>();
		
		try {
			
			String sql ="select * from Worker";
			preparedstatement  = connection.prepareStatement(sql);
			ResultSet set = preparedstatement.executeQuery();
			 System.out.println("Eid\t\tName\t\tPhno\t\t Age\t\t "
			 		+ "Experience\t\t Salary"); 
			 while (set.next()) {
			        int id = set.getInt("Eid");
	                String name = set.getString("Name");
	                String phno = set.getString("Phno");
	                int age = set.getInt("Age");
	                int exp = set.getInt("Experience");
	                String Salary = set.getString("Salary");
	                System.out.println(id + "\t\t" + name
	                + "\t\t" + phno+ "\t\t" + age+ "\t\t" + exp + "\t\t" 
	                		+ Salary);
	            }
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		return workers;
	}
}
