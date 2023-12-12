package table_creation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class User_table {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Nitin@2402");
		Statement st2=con.createStatement();
		int rs=st2.executeUpdate("create table usersetpass(username varchar(20),userpassword int(10))");
		System.out.println("created successfullyyyyyy");
		
		con.close();
		st2.close();
	}

}
