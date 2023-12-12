package UTILITY;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBMOBILE {
public static Connection getConnection() {
	Connection con=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Nitin@2402");	
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}catch(SQLException q) {
		q.printStackTrace();
	}
	return con;
}
public static void main(String[] args) {
	DBMOBILE.getConnection();
}
}
