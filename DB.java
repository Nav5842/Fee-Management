package com.dao;
import java.sql.*;
public class DB {
public static Connection getCon(){
	Connection con=null;
	try{
		System.out.println("loading");
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost/fee","root","67067");
		System.out.println("connected");
	}catch(Exception ex){System.out.println(ex);}
	return con;
}
}